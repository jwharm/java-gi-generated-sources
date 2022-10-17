package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoFontMap} represents the set of fonts available for a
 * particular rendering system.
 * <p>
 * This is a virtual object with implementations being specific to
 * particular rendering systems.
 */
public class FontMap extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public FontMap(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FontMap */
    public static FontMap castFrom(org.gtk.gobject.Object gobject) {
        return new FontMap(gobject.refcounted());
    }
    
    private static final MethodHandle pango_font_map_changed = Interop.downcallHandle(
        "pango_font_map_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Forces a change in the context, which will cause any {@code PangoContext}
     * using this fontmap to change.
     * <p>
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the
     * context and such data is changed.
     */
    public @NotNull void changed() {
        try {
            pango_font_map_changed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_map_create_context = Interop.downcallHandle(
        "pango_font_map_create_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@code PangoContext} connected to {@code fontmap}.
     * <p>
     * This is equivalent to {@link Context#Context} followed by
     * {@link Context#setFontMap}.
     * <p>
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a {@code PangoContext}.
     * For instance, the GTK toolkit has, among others,
     * gtk_widget_get_pango_context(). Use those instead.
     */
    public @NotNull Context createContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_map_create_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Context(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_font_map_get_family = Interop.downcallHandle(
        "pango_font_map_get_family",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a font family by name.
     */
    public @NotNull FontFamily getFamily(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_map_get_family.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontFamily(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_font_map_get_serial = Interop.downcallHandle(
        "pango_font_map_get_serial",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current serial number of {@code fontmap}.
     * <p>
     * The serial number is initialized to an small number larger than zero
     * when a new fontmap is created and is increased whenever the fontmap
     * is changed. It may wrap, but will never have the value 0. Since it can
     * wrap, never compare it with "less than", always use "not equals".
     * <p>
     * The fontmap can only be changed using backend-specific API, like changing
     * fontmap resolution.
     * <p>
     * This can be used to automatically detect changes to a {@code PangoFontMap},
     * like in {@code PangoContext}.
     */
    public int getSerial() {
        int RESULT;
        try {
            RESULT = (int) pango_font_map_get_serial.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_font_map_list_families = Interop.downcallHandle(
        "pango_font_map_list_families",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * List all families for a fontmap.
     * <p>
     * Note that the returned families are not in any particular order.
     * <p>
     * {@code PangoFontMap} also implemented the {@code Gio.ListModel} interface
     * for enumerating families.
     */
    public @NotNull void listFamilies(@NotNull Out<FontFamily[]> families, @NotNull Out<Integer> nFamilies) {
        MemorySegment familiesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nFamiliesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            pango_font_map_list_families.invokeExact(handle(), (Addressable) familiesPOINTER.address(), (Addressable) nFamiliesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nFamilies.set(nFamiliesPOINTER.get(ValueLayout.JAVA_INT, 0));
        FontFamily[] familiesARRAY = new FontFamily[nFamilies.get().intValue()];
        for (int I = 0; I < nFamilies.get().intValue(); I++) {
            var OBJ = familiesPOINTER.get(ValueLayout.ADDRESS, I);
            familiesARRAY[I] = new FontFamily(Refcounted.get(OBJ, false));
        }
        families.set(familiesARRAY);
    }
    
    private static final MethodHandle pango_font_map_load_font = Interop.downcallHandle(
        "pango_font_map_load_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Load the font in the fontmap that is the closest match for {@code desc}.
     */
    public @Nullable Font loadFont(@NotNull Context context, @NotNull FontDescription desc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_map_load_font.invokeExact(handle(), context.handle(), desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Font(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_font_map_load_fontset = Interop.downcallHandle(
        "pango_font_map_load_fontset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Load a set of fonts in the fontmap that can be used to render
     * a font matching {@code desc}.
     */
    public @Nullable Fontset loadFontset(@NotNull Context context, @NotNull FontDescription desc, @NotNull Language language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_map_load_fontset.invokeExact(handle(), context.handle(), desc.handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Fontset(Refcounted.get(RESULT, true));
    }
    
}
