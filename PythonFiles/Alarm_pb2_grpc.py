# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import Alarm_pb2 as Alarm__pb2


class AlarmServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.doorLock = channel.unary_unary(
                '/AlarmService/doorLock',
                request_serializer=Alarm__pb2.UnwantedVisitor.SerializeToString,
                response_deserializer=Alarm__pb2.Speaker.FromString,
                )


class AlarmServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def doorLock(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_AlarmServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'doorLock': grpc.unary_unary_rpc_method_handler(
                    servicer.doorLock,
                    request_deserializer=Alarm__pb2.UnwantedVisitor.FromString,
                    response_serializer=Alarm__pb2.Speaker.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'AlarmService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AlarmService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def doorLock(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/AlarmService/doorLock',
            Alarm__pb2.UnwantedVisitor.SerializeToString,
            Alarm__pb2.Speaker.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
