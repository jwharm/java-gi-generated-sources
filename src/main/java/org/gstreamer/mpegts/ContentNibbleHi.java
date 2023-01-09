package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum ContentNibbleHi implements io.github.jwharm.javagi.Enumeration {
    
    MOVIE_DRAMA(1),
    
    NEWS_CURRENT_AFFAIRS(2),
    
    SHOW_GAME_SHOW(3),
    
    SPORTS(4),
    
    CHILDREN_YOUTH_PROGRAM(5),
    
    MUSIC_BALLET_DANCE(6),
    
    ARTS_CULTURE(7),
    
    SOCIAL_POLITICAL_ECONOMICS(8),
    
    EDUCATION_SCIENCE_FACTUAL(9),
    
    LEISURE_HOBBIES(10),
    
    SPECIAL_CHARACTERISTICS(11);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsContentNibbleHi";
    
    private final int value;
    
    /**
     * Create a new ContentNibbleHi for the provided value
     * @param numeric value the enum value
     */
    ContentNibbleHi(int value) {
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
     * Create a new ContentNibbleHi for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ContentNibbleHi of(int value) {
        return switch (value) {
            case 1 -> MOVIE_DRAMA;
            case 2 -> NEWS_CURRENT_AFFAIRS;
            case 3 -> SHOW_GAME_SHOW;
            case 4 -> SPORTS;
            case 5 -> CHILDREN_YOUTH_PROGRAM;
            case 6 -> MUSIC_BALLET_DANCE;
            case 7 -> ARTS_CULTURE;
            case 8 -> SOCIAL_POLITICAL_ECONOMICS;
            case 9 -> EDUCATION_SCIENCE_FACTUAL;
            case 10 -> LEISURE_HOBBIES;
            case 11 -> SPECIAL_CHARACTERISTICS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
