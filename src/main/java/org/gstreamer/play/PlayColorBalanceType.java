package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PlayColorBalanceType implements io.github.jwharm.javagi.Enumeration {
    /**
     * hue or color balance.
     */
    HUE(3),
    /**
     * brightness or black level.
     */
    BRIGHTNESS(0),
    /**
     * color saturation or chroma
     * gain.
     */
    SATURATION(2),
    /**
     * contrast or luma gain.
     */
    CONTRAST(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayColorBalanceType";
    
    private final int value;
    PlayColorBalanceType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PlayColorBalanceType of(int value) {
        return switch (value) {
            case 3 -> HUE;
            case 0 -> BRIGHTNESS;
            case 2 -> SATURATION;
            case 1 -> CONTRAST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets a string representing the given color balance type.
     * @param type a {@link PlayColorBalanceType}
     * @return a string with the name of the color
     *   balance type.
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.play.PlayColorBalanceType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_color_balance_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_color_balance_type_get_name = Interop.downcallHandle(
            "gst_play_color_balance_type_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
