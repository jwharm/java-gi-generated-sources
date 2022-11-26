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
public class Gravity extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoGravity";
    
    /**
     * Glyphs stand upright (default) &lt;img align="right" valign="center" src="m-south.png"&gt;
     */
    public static final Gravity SOUTH = new Gravity(0);
    
    /**
     * Glyphs are rotated 90 degrees counter-clockwise. &lt;img align="right" valign="center" src="m-east.png"&gt;
     */
    public static final Gravity EAST = new Gravity(1);
    
    /**
     * Glyphs are upside-down. &lt;img align="right" valign="cener" src="m-north.png"&gt;
     */
    public static final Gravity NORTH = new Gravity(2);
    
    /**
     * Glyphs are rotated 90 degrees clockwise. &lt;img align="right" valign="center" src="m-west.png"&gt;
     */
    public static final Gravity WEST = new Gravity(3);
    
    /**
     * Gravity is resolved from the context matrix
     */
    public static final Gravity AUTO = new Gravity(4);
    
    public Gravity(int value) {
        super(value);
    }
    
    /**
     * Finds the gravity that best matches the rotation component
     * in a {@code PangoMatrix}.
     * @param matrix a {@code PangoMatrix}
     * @return the gravity of {@code matrix}, which will never be
     * {@link Gravity#AUTO}, or {@link Gravity#SOUTH} if {@code matrix} is {@code null}
     */
    public static @NotNull org.pango.Gravity getForMatrix(@Nullable org.pango.Matrix matrix) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_matrix.invokeExact(
                    (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Gravity(RESULT);
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
    public static @NotNull org.pango.Gravity getForScript(@NotNull org.pango.Script script, @NotNull org.pango.Gravity baseGravity, @NotNull org.pango.GravityHint hint) {
        java.util.Objects.requireNonNull(script, "Parameter 'script' must not be null");
        java.util.Objects.requireNonNull(baseGravity, "Parameter 'baseGravity' must not be null");
        java.util.Objects.requireNonNull(hint, "Parameter 'hint' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_script.invokeExact(
                    script.getValue(),
                    baseGravity.getValue(),
                    hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Gravity(RESULT);
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
    public static @NotNull org.pango.Gravity getForScriptAndWidth(@NotNull org.pango.Script script, boolean wide, @NotNull org.pango.Gravity baseGravity, @NotNull org.pango.GravityHint hint) {
        java.util.Objects.requireNonNull(script, "Parameter 'script' must not be null");
        java.util.Objects.requireNonNull(baseGravity, "Parameter 'baseGravity' must not be null");
        java.util.Objects.requireNonNull(hint, "Parameter 'hint' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_script_and_width.invokeExact(
                    script.getValue(),
                    wide ? 1 : 0,
                    baseGravity.getValue(),
                    hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Gravity(RESULT);
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
    public static double toRotation(@NotNull org.pango.Gravity gravity) {
        java.util.Objects.requireNonNull(gravity, "Parameter 'gravity' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.pango_gravity_to_rotation.invokeExact(
                    gravity.getValue());
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
