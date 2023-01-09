package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoGravity} represents the orientation of glyphs in a segment
 * of text.
 * <p>
 * This is useful when rendering vertical text layouts. In those situations,
 * the layout is rotated using a non-identity {@code Pango.Matrix}, and then
 * glyph orientation is controlled using {@code PangoGravity}.
 * <p>
 * Not every value in this enumeration makes sense for every usage of
 * {@code PangoGravity}; for example, {@link Gravity#AUTO} only can be passed to
 * {@link Context#setBaseGravity} and can only be returned by
 * {@link Context#getBaseGravity}.
 * <p>
 * See also: {@code Pango.GravityHint}
 * @version 1.16
 */
public enum Gravity implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Glyphs stand upright (default) &lt;img align="right" valign="center" src="m-south.png"&gt;
     */
    SOUTH(0),
    
    /**
     * Glyphs are rotated 90 degrees counter-clockwise. &lt;img align="right" valign="center" src="m-east.png"&gt;
     */
    EAST(1),
    
    /**
     * Glyphs are upside-down. &lt;img align="right" valign="cener" src="m-north.png"&gt;
     */
    NORTH(2),
    
    /**
     * Glyphs are rotated 90 degrees clockwise. &lt;img align="right" valign="center" src="m-west.png"&gt;
     */
    WEST(3),
    
    /**
     * Gravity is resolved from the context matrix
     */
    AUTO(4);
    
    private static final java.lang.String C_TYPE_NAME = "PangoGravity";
    
    private final int value;
    
    /**
     * Create a new Gravity for the provided value
     * @param numeric value the enum value
     */
    Gravity(int value) {
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
     * Create a new Gravity for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Gravity of(int value) {
        return switch (value) {
            case 0 -> SOUTH;
            case 1 -> EAST;
            case 2 -> NORTH;
            case 3 -> WEST;
            case 4 -> AUTO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Finds the gravity that best matches the rotation component
     * in a {@code PangoMatrix}.
     * @param matrix a {@code PangoMatrix}
     * @return the gravity of {@code matrix}, which will never be
     * {@link Gravity#AUTO}, or {@link Gravity#SOUTH} if {@code matrix} is {@code null}
     */
    public static org.pango.Gravity getForMatrix(@Nullable org.pango.Matrix matrix) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_matrix.invokeExact((Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Gravity.of(RESULT);
    }
    
    /**
     * Returns the gravity to use in laying out a {@code PangoItem}.
     * <p>
     * The gravity is determined based on the script, base gravity, and hint.
     * <p>
     * If {@code base_gravity} is {@link Gravity#AUTO}, it is first replaced with the
     * preferred gravity of {@code script}.  To get the preferred gravity of a script,
     * pass {@link Gravity#AUTO} and {@link GravityHint#STRONG} in.
     * @param script {@code PangoScript} to query
     * @param baseGravity base gravity of the paragraph
     * @param hint orientation hint
     * @return resolved gravity suitable to use for a run of text
     * with {@code script}
     */
    public static org.pango.Gravity getForScript(org.pango.Script script, org.pango.Gravity baseGravity, org.pango.GravityHint hint) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_script.invokeExact(
                    script.getValue(),
                    baseGravity.getValue(),
                    hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Gravity.of(RESULT);
    }
    
    /**
     * Returns the gravity to use in laying out a single character
     * or {@code PangoItem}.
     * <p>
     * The gravity is determined based on the script, East Asian width,
     * base gravity, and hint,
     * <p>
     * This function is similar to {@link Gravity#getForScript} except
     * that this function makes a distinction between narrow/half-width and
     * wide/full-width characters also. Wide/full-width characters always
     * stand <em>upright</em>, that is, they always take the base gravity,
     * whereas narrow/full-width characters are always rotated in vertical
     * context.
     * <p>
     * If {@code base_gravity} is {@link Gravity#AUTO}, it is first replaced with the
     * preferred gravity of {@code script}.
     * @param script {@code PangoScript} to query
     * @param wide {@code true} for wide characters as returned by g_unichar_iswide()
     * @param baseGravity base gravity of the paragraph
     * @param hint orientation hint
     * @return resolved gravity suitable to use for a run of text
     * with {@code script} and {@code wide}.
     */
    public static org.pango.Gravity getForScriptAndWidth(org.pango.Script script, boolean wide, org.pango.Gravity baseGravity, org.pango.GravityHint hint) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_script_and_width.invokeExact(
                    script.getValue(),
                    Marshal.booleanToInteger.marshal(wide, null).intValue(),
                    baseGravity.getValue(),
                    hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Gravity.of(RESULT);
    }
    
    /**
     * Converts a {@code PangoGravity} value to its natural rotation in radians.
     * <p>
     * Note that {@link Matrix#rotate} takes angle in degrees, not radians.
     * So, to call {@code Pango#Matrix,rotate} with the output of this function
     * you should multiply it by (180. / G_PI).
     * @param gravity gravity to query, should not be {@link Gravity#AUTO}
     * @return the rotation value corresponding to {@code gravity}.
     */
    public static double toRotation(org.pango.Gravity gravity) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.pango_gravity_to_rotation.invokeExact(gravity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_gravity_get_for_matrix = Interop.downcallHandle(
                "pango_gravity_get_for_matrix",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_gravity_get_for_script = Interop.downcallHandle(
                "pango_gravity_get_for_script",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_gravity_get_for_script_and_width = Interop.downcallHandle(
                "pango_gravity_get_for_script_and_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_gravity_to_rotation = Interop.downcallHandle(
                "pango_gravity_to_rotation",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
    }
}
