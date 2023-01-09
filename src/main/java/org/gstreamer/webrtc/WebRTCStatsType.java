package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum WebRTCStatsType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * codec
     */
    CODEC(1),
    
    /**
     * inbound-rtp
     */
    INBOUND_RTP(2),
    
    /**
     * outbound-rtp
     */
    OUTBOUND_RTP(3),
    
    /**
     * remote-inbound-rtp
     */
    REMOTE_INBOUND_RTP(4),
    
    /**
     * remote-outbound-rtp
     */
    REMOTE_OUTBOUND_RTP(5),
    
    /**
     * csrc
     */
    CSRC(6),
    
    /**
     * peer-connectiion
     */
    PEER_CONNECTION(7),
    
    /**
     * data-channel
     */
    DATA_CHANNEL(8),
    
    /**
     * stream
     */
    STREAM(9),
    
    /**
     * transport
     */
    TRANSPORT(10),
    
    /**
     * candidate-pair
     */
    CANDIDATE_PAIR(11),
    
    /**
     * local-candidate
     */
    LOCAL_CANDIDATE(12),
    
    /**
     * remote-candidate
     */
    REMOTE_CANDIDATE(13),
    
    /**
     * certificate
     */
    CERTIFICATE(14);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCStatsType";
    
    private final int value;
    
    /**
     * Create a new WebRTCStatsType for the provided value
     * @param numeric value the enum value
     */
    WebRTCStatsType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new WebRTCStatsType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static WebRTCStatsType of(int value) {
        return switch (value) {
            case 1 -> CODEC;
            case 2 -> INBOUND_RTP;
            case 3 -> OUTBOUND_RTP;
            case 4 -> REMOTE_INBOUND_RTP;
            case 5 -> REMOTE_OUTBOUND_RTP;
            case 6 -> CSRC;
            case 7 -> PEER_CONNECTION;
            case 8 -> DATA_CHANNEL;
            case 9 -> STREAM;
            case 10 -> TRANSPORT;
            case 11 -> CANDIDATE_PAIR;
            case 12 -> LOCAL_CANDIDATE;
            case 13 -> REMOTE_CANDIDATE;
            case 14 -> CERTIFICATE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
