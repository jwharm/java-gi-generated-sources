package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration of rtsp header fields
 */
public enum RTSPHeaderField implements io.github.jwharm.javagi.Enumeration {
    
    INVALID(0),
    
    ACCEPT(1),
    
    ACCEPT_ENCODING(2),
    
    ACCEPT_LANGUAGE(3),
    
    ALLOW(4),
    
    AUTHORIZATION(5),
    
    BANDWIDTH(6),
    
    BLOCKSIZE(7),
    
    CACHE_CONTROL(8),
    
    CONFERENCE(9),
    
    CONNECTION(10),
    
    CONTENT_BASE(11),
    
    CONTENT_ENCODING(12),
    
    CONTENT_LANGUAGE(13),
    
    CONTENT_LENGTH(14),
    
    CONTENT_LOCATION(15),
    
    CONTENT_TYPE(16),
    
    CSEQ(17),
    
    DATE(18),
    
    EXPIRES(19),
    
    FROM(20),
    
    IF_MODIFIED_SINCE(21),
    
    LAST_MODIFIED(22),
    
    PROXY_AUTHENTICATE(23),
    
    PROXY_REQUIRE(24),
    
    PUBLIC(25),
    
    RANGE(26),
    
    REFERER(27),
    
    REQUIRE(28),
    
    RETRY_AFTER(29),
    
    RTP_INFO(30),
    
    SCALE(31),
    
    SESSION(32),
    
    SERVER(33),
    
    SPEED(34),
    
    TRANSPORT(35),
    
    UNSUPPORTED(36),
    
    USER_AGENT(37),
    
    VIA(38),
    
    WWW_AUTHENTICATE(39),
    
    CLIENT_CHALLENGE(40),
    
    REAL_CHALLENGE1(41),
    
    REAL_CHALLENGE2(42),
    
    REAL_CHALLENGE3(43),
    
    SUBSCRIBE(44),
    
    ALERT(45),
    
    CLIENT_ID(46),
    
    COMPANY_ID(47),
    
    GUID(48),
    
    REGION_DATA(49),
    
    MAX_ASM_WIDTH(50),
    
    LANGUAGE(51),
    
    PLAYER_START_TIME(52),
    
    LOCATION(53),
    
    ETAG(54),
    
    IF_MATCH(55),
    
    ACCEPT_CHARSET(56),
    
    SUPPORTED(57),
    
    VARY(58),
    
    X_ACCELERATE_STREAMING(59),
    
    X_ACCEPT_AUTHENT(60),
    
    X_ACCEPT_PROXY_AUTHENT(61),
    
    X_BROADCAST_ID(62),
    
    X_BURST_STREAMING(63),
    
    X_NOTICE(64),
    
    X_PLAYER_LAG_TIME(65),
    
    X_PLAYLIST(66),
    
    X_PLAYLIST_CHANGE_NOTICE(67),
    
    X_PLAYLIST_GEN_ID(68),
    
    X_PLAYLIST_SEEK_ID(69),
    
    X_PROXY_CLIENT_AGENT(70),
    
    X_PROXY_CLIENT_VERB(71),
    
    X_RECEDING_PLAYLISTCHANGE(72),
    
    X_RTP_INFO(73),
    
    X_STARTUPPROFILE(74),
    
    TIMESTAMP(75),
    
    AUTHENTICATION_INFO(76),
    
    HOST(77),
    
    PRAGMA(78),
    
    X_SERVER_IP_ADDRESS(79),
    
    X_SESSIONCOOKIE(80),
    
    RTCP_INTERVAL(81),
    
    KEYMGMT(82),
    
    PIPELINED_REQUESTS(83),
    
    MEDIA_PROPERTIES(84),
    
    SEEK_STYLE(85),
    
    ACCEPT_RANGES(86),
    
    FRAMES(87),
    
    RATE_CONTROL(88),
    
    LAST(89);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPHeaderField";
    
    private final int value;
    
    /**
     * Create a new RTSPHeaderField for the provided value
     * @param numeric value the enum value
     */
    RTSPHeaderField(int value) {
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
     * Create a new RTSPHeaderField for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTSPHeaderField of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> ACCEPT;
            case 2 -> ACCEPT_ENCODING;
            case 3 -> ACCEPT_LANGUAGE;
            case 4 -> ALLOW;
            case 5 -> AUTHORIZATION;
            case 6 -> BANDWIDTH;
            case 7 -> BLOCKSIZE;
            case 8 -> CACHE_CONTROL;
            case 9 -> CONFERENCE;
            case 10 -> CONNECTION;
            case 11 -> CONTENT_BASE;
            case 12 -> CONTENT_ENCODING;
            case 13 -> CONTENT_LANGUAGE;
            case 14 -> CONTENT_LENGTH;
            case 15 -> CONTENT_LOCATION;
            case 16 -> CONTENT_TYPE;
            case 17 -> CSEQ;
            case 18 -> DATE;
            case 19 -> EXPIRES;
            case 20 -> FROM;
            case 21 -> IF_MODIFIED_SINCE;
            case 22 -> LAST_MODIFIED;
            case 23 -> PROXY_AUTHENTICATE;
            case 24 -> PROXY_REQUIRE;
            case 25 -> PUBLIC;
            case 26 -> RANGE;
            case 27 -> REFERER;
            case 28 -> REQUIRE;
            case 29 -> RETRY_AFTER;
            case 30 -> RTP_INFO;
            case 31 -> SCALE;
            case 32 -> SESSION;
            case 33 -> SERVER;
            case 34 -> SPEED;
            case 35 -> TRANSPORT;
            case 36 -> UNSUPPORTED;
            case 37 -> USER_AGENT;
            case 38 -> VIA;
            case 39 -> WWW_AUTHENTICATE;
            case 40 -> CLIENT_CHALLENGE;
            case 41 -> REAL_CHALLENGE1;
            case 42 -> REAL_CHALLENGE2;
            case 43 -> REAL_CHALLENGE3;
            case 44 -> SUBSCRIBE;
            case 45 -> ALERT;
            case 46 -> CLIENT_ID;
            case 47 -> COMPANY_ID;
            case 48 -> GUID;
            case 49 -> REGION_DATA;
            case 50 -> MAX_ASM_WIDTH;
            case 51 -> LANGUAGE;
            case 52 -> PLAYER_START_TIME;
            case 53 -> LOCATION;
            case 54 -> ETAG;
            case 55 -> IF_MATCH;
            case 56 -> ACCEPT_CHARSET;
            case 57 -> SUPPORTED;
            case 58 -> VARY;
            case 59 -> X_ACCELERATE_STREAMING;
            case 60 -> X_ACCEPT_AUTHENT;
            case 61 -> X_ACCEPT_PROXY_AUTHENT;
            case 62 -> X_BROADCAST_ID;
            case 63 -> X_BURST_STREAMING;
            case 64 -> X_NOTICE;
            case 65 -> X_PLAYER_LAG_TIME;
            case 66 -> X_PLAYLIST;
            case 67 -> X_PLAYLIST_CHANGE_NOTICE;
            case 68 -> X_PLAYLIST_GEN_ID;
            case 69 -> X_PLAYLIST_SEEK_ID;
            case 70 -> X_PROXY_CLIENT_AGENT;
            case 71 -> X_PROXY_CLIENT_VERB;
            case 72 -> X_RECEDING_PLAYLISTCHANGE;
            case 73 -> X_RTP_INFO;
            case 74 -> X_STARTUPPROFILE;
            case 75 -> TIMESTAMP;
            case 76 -> AUTHENTICATION_INFO;
            case 77 -> HOST;
            case 78 -> PRAGMA;
            case 79 -> X_SERVER_IP_ADDRESS;
            case 80 -> X_SESSIONCOOKIE;
            case 81 -> RTCP_INTERVAL;
            case 82 -> KEYMGMT;
            case 83 -> PIPELINED_REQUESTS;
            case 84 -> MEDIA_PROPERTIES;
            case 85 -> SEEK_STYLE;
            case 86 -> ACCEPT_RANGES;
            case 87 -> FRAMES;
            case 88 -> RATE_CONTROL;
            case 89 -> LAST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
