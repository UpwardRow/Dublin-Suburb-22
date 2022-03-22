package ds.adam.VideoDoorbell;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Properties;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.util.concurrent.TimeUnit;

import ds.adam.VideoDoorbell.DoorLockStatus;
import ds.adam.VideoDoorbell.DoorLockTamper;
import ds.adam.VideoDoorbell.VideoDoorbellServiceGrpc.VideoDoorbellServiceImplBase;

public class VideoDoorbellServer extends VideoDoorbellServiceImplBase {
	
	public static void main(String[] args) {
		
		//Creating instance of VideoDoorbellServer
		VideoDoorbellServer videodoorbellserver = new VideoDoorbellServer();
		
		Properties prop = videodoorbellserver.getProperties();
		
		videodoorbellserver.registerService(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));
		
		try {
			
			Server server = ServerBuilder.forPort(port)
					.addService(videodoorbellserver)
					.build()
					.start();
			
			System.out.println("Video doorbell server starting, listenting on port " + port);
			
			server.awaitTermination();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	
	private Properties getProperties() {
		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/DublinSuburb22.properties")) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("VideoDoorbell service properies ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
	}
	
	private  void registerService(Properties prop) {
		 try {
	            // Creating a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;//"_DublinSuburb22._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;// "Dublin_Suburb_22";
	           // int service_port = 1234;
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;
	            
	            String service_description = prop.getProperty("service_description")  ;//"Service for home security system";
	            
	            // Registering a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registering service with type %s and name %s \n", service_type, service_name);
	            
	            // Waiting for 1 second
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	@Override
	public StreamObserver<DoorLockStatus> doorStatus(
			StreamObserver<DoorLockTamper> responseObserver){
		
		return new StreamObserver<DoorLockStatus>() {
			
			ArrayList<Boolean> list = new ArrayList<>();
			
			@Override
			public void onNext(DoorLockStatus doorLockStatus) {
				
				System.out.println("Here is the value of the door lock status " + doorLockStatus.getCheck());
				
				list.add(doorLockStatus.getCheck());
				
				System.out.println("Checked the status of the door lock");
			}
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}
			
			@Override
			public void onCompleted() {
				System.out.println("Received doorStatus completed");
				
				Boolean doorLocked;
				
				if(list.contains(true)) {
					doorLocked = true;
				} else {
					doorLocked = false;
				}
				
				DoorLockTamper tamper = DoorLockTamper
						.newBuilder()
						.setIntruder(doorLocked)
						.build();
				
				responseObserver.onNext(tamper);
				
				//Success from the stream
				responseObserver.onCompleted();
			}
		};
	}
	
	public StreamObserver<Video> homeVideo(
			StreamObserver<BellRequest> responseObserver){
		
		return new StreamObserver<Video> () {
			
			/*
			 * This method is to receive a value from the stream.
			 */
			
			@Override
			public void onNext(Video video) {
				int iteratedValue = 0;
				
				for(int i = 0; i < 5; i++) {
					
					iteratedValue++;
					
				}
				
				System.out.println("Here is the number from video " + video.getExampleNumber1() + 
						". Here is the iterated number " + iteratedValue);
				
				int videoValue = video.getExampleNumber1() + iteratedValue;
				
				BellRequest bell = BellRequest.newBuilder()
						.setExampleNumber2(videoValue)
						.build();
				
				
				responseObserver.onNext(bell);
			}
			
			@Override
			public void onError(Throwable t) {
				
				//Error from the stream
				t.printStackTrace();
			}
			
			@Override
			public void onCompleted() {
				
				System.out.println("Received homeVideo completed");
				
				//Success from the stream
				responseObserver.onCompleted();
			}
		};
	}
}