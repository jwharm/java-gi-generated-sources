package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration of rtsp status codes
 */
public enum RTSPStatusCode implements io.github.jwharm.javagi.Enumeration {
    INVALID(0),
    CONTINUE(100),
    OK(200),
    CREATED(201),
    LOW_ON_STORAGE(250),
    MULTIPLE_CHOICES(300),
    MOVED_PERMANENTLY(301),
    MOVE_TEMPORARILY(302),
    SEE_OTHER(303),
    NOT_MODIFIED(304),
    USE_PROXY(305),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENT_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404),
    METHOD_NOT_ALLOWED(405),
    NOT_ACCEPTABLE(406),
    PROXY_AUTH_REQUIRED(407),
    REQUEST_TIMEOUT(408),
    GONE(410),
    LENGTH_REQUIRED(411),
    PRECONDITION_FAILED(412),
    REQUEST_ENTITY_TOO_LARGE(413),
    REQUEST_URI_TOO_LARGE(414),
    UNSUPPORTED_MEDIA_TYPE(415),
    PARAMETER_NOT_UNDERSTOOD(451),
    CONFERENCE_NOT_FOUND(452),
    NOT_ENOUGH_BANDWIDTH(453),
    SESSION_NOT_FOUND(454),
    METHOD_NOT_VALID_IN_THIS_STATE(455),
    HEADER_FIELD_NOT_VALID_FOR_RESOURCE(456),
    INVALID_RANGE(457),
    PARAMETER_IS_READONLY(458),
    AGGREGATE_OPERATION_NOT_ALLOWED(459),
    ONLY_AGGREGATE_OPERATION_ALLOWED(460),
    UNSUPPORTED_TRANSPORT(461),
    DESTINATION_UNREACHABLE(462),
    KEY_MANAGEMENT_FAILURE(463),
    INTERNAL_SERVER_ERROR(500),
    NOT_IMPLEMENTED(501),
    BAD_GATEWAY(502),
    SERVICE_UNAVAILABLE(503),
    GATEWAY_TIMEOUT(504),
    RTSP_VERSION_NOT_SUPPORTED(505),
    OPTION_NOT_SUPPORTED(551);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPStatusCode";
    
    private final int value;
    RTSPStatusCode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RTSPStatusCode of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 100 -> CONTINUE;
            case 200 -> OK;
            case 201 -> CREATED;
            case 250 -> LOW_ON_STORAGE;
            case 300 -> MULTIPLE_CHOICES;
            case 301 -> MOVED_PERMANENTLY;
            case 302 -> MOVE_TEMPORARILY;
            case 303 -> SEE_OTHER;
            case 304 -> NOT_MODIFIED;
            case 305 -> USE_PROXY;
            case 400 -> BAD_REQUEST;
            case 401 -> UNAUTHORIZED;
            case 402 -> PAYMENT_REQUIRED;
            case 403 -> FORBIDDEN;
            case 404 -> NOT_FOUND;
            case 405 -> METHOD_NOT_ALLOWED;
            case 406 -> NOT_ACCEPTABLE;
            case 407 -> PROXY_AUTH_REQUIRED;
            case 408 -> REQUEST_TIMEOUT;
            case 410 -> GONE;
            case 411 -> LENGTH_REQUIRED;
            case 412 -> PRECONDITION_FAILED;
            case 413 -> REQUEST_ENTITY_TOO_LARGE;
            case 414 -> REQUEST_URI_TOO_LARGE;
            case 415 -> UNSUPPORTED_MEDIA_TYPE;
            case 451 -> PARAMETER_NOT_UNDERSTOOD;
            case 452 -> CONFERENCE_NOT_FOUND;
            case 453 -> NOT_ENOUGH_BANDWIDTH;
            case 454 -> SESSION_NOT_FOUND;
            case 455 -> METHOD_NOT_VALID_IN_THIS_STATE;
            case 456 -> HEADER_FIELD_NOT_VALID_FOR_RESOURCE;
            case 457 -> INVALID_RANGE;
            case 458 -> PARAMETER_IS_READONLY;
            case 459 -> AGGREGATE_OPERATION_NOT_ALLOWED;
            case 460 -> ONLY_AGGREGATE_OPERATION_ALLOWED;
            case 461 -> UNSUPPORTED_TRANSPORT;
            case 462 -> DESTINATION_UNREACHABLE;
            case 463 -> KEY_MANAGEMENT_FAILURE;
            case 500 -> INTERNAL_SERVER_ERROR;
            case 501 -> NOT_IMPLEMENTED;
            case 502 -> BAD_GATEWAY;
            case 503 -> SERVICE_UNAVAILABLE;
            case 504 -> GATEWAY_TIMEOUT;
            case 505 -> RTSP_VERSION_NOT_SUPPORTED;
            case 551 -> OPTION_NOT_SUPPORTED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
