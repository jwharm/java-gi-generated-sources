package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkPaperSize} handles paper sizes.
 * <p>
 * It uses the standard called
 * <a href="http://www.pwg.org/standards.html">PWG 5101.1-2002 PWG: Standard for Media Standardized Names</a>
 * to name the paper sizes (and to get the data for the page sizes).
 * In addition to standard paper sizes, {@code GtkPaperSize} allows to
 * construct custom paper sizes with arbitrary dimensions.
 * <p>
 * The {@code GtkPaperSize} object stores not only the dimensions (width
 * and height) of a paper size and its name, it also provides
 * default print margins.
 */
public class PaperSize extends io.github.jwharm.javagi.ResourceBase {

    public PaperSize(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gtk_paper_size_new = Interop.downcallHandle(
        "gtk_paper_size_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String name) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new.invokeExact(Interop.allocateNativeString(name)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPaperSize} object by parsing a
     * <a href="ftp://ftp.pwg.org/pub/pwg/candidates/cs-pwgmsn10-20020226-5101.1.pdf">PWG 5101.1-2002</a>
     * paper name.
     * <p>
     * If {@code name} is {@code null}, the default paper size is returned,
     * see {@link Gtk#PaperSize}.
     */
    public PaperSize(@Nullable java.lang.String name) {
        super(constructNew(name));
    }
    
    private static final MethodHandle gtk_paper_size_new_custom = Interop.downcallHandle(
        "gtk_paper_size_new_custom",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewCustom(@NotNull java.lang.String name, @NotNull java.lang.String displayName, @NotNull double width, @NotNull double height, @NotNull Unit unit) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_custom.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(displayName), width, height, unit.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPaperSize} object with the
     * given parameters.
     */
    public static PaperSize newCustom(@NotNull java.lang.String name, @NotNull java.lang.String displayName, @NotNull double width, @NotNull double height, @NotNull Unit unit) {
        return new PaperSize(constructNewCustom(name, displayName, width, height, unit));
    }
    
    private static final MethodHandle gtk_paper_size_new_from_gvariant = Interop.downcallHandle(
        "gtk_paper_size_new_from_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_from_gvariant.invokeExact(variant.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deserialize a paper size from a {@code GVariant}.
     * <p>
     * The `GVariant must be in the format produced by
     * {@link PaperSize#toGvariant}.
     */
    public static PaperSize newFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        return new PaperSize(constructNewFromGvariant(variant));
    }
    
    private static final MethodHandle gtk_paper_size_new_from_ipp = Interop.downcallHandle(
        "gtk_paper_size_new_from_ipp",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    private static Refcounted constructNewFromIpp(@NotNull java.lang.String ippName, @NotNull double width, @NotNull double height) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_from_ipp.invokeExact(Interop.allocateNativeString(ippName), width, height), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPaperSize} object by using
     * IPP information.
     * <p>
     * If {@code ipp_name} is not a recognized paper name,
     * {@code width} and {@code height} are used to
     * construct a custom {@code GtkPaperSize} object.
     */
    public static PaperSize newFromIpp(@NotNull java.lang.String ippName, @NotNull double width, @NotNull double height) {
        return new PaperSize(constructNewFromIpp(ippName, width, height));
    }
    
    private static final MethodHandle gtk_paper_size_new_from_key_file = Interop.downcallHandle(
        "gtk_paper_size_new_from_key_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_from_key_file.invokeExact(keyFile.handle(), Interop.allocateNativeString(groupName), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reads a paper size from the group {@code group_name} in the key file
     * {@code key_file}.
     */
    public static PaperSize newFromKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        return new PaperSize(constructNewFromKeyFile(keyFile, groupName));
    }
    
    private static final MethodHandle gtk_paper_size_new_from_ppd = Interop.downcallHandle(
        "gtk_paper_size_new_from_ppd",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    private static Refcounted constructNewFromPpd(@NotNull java.lang.String ppdName, @NotNull java.lang.String ppdDisplayName, @NotNull double width, @NotNull double height) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_from_ppd.invokeExact(Interop.allocateNativeString(ppdName), Interop.allocateNativeString(ppdDisplayName), width, height), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPaperSize} object by using
     * PPD information.
     * <p>
     * If {@code ppd_name} is not a recognized PPD paper name,
     * {@code ppd_display_name}, {@code width} and {@code height} are used to
     * construct a custom {@code GtkPaperSize} object.
     */
    public static PaperSize newFromPpd(@NotNull java.lang.String ppdName, @NotNull java.lang.String ppdDisplayName, @NotNull double width, @NotNull double height) {
        return new PaperSize(constructNewFromPpd(ppdName, ppdDisplayName, width, height));
    }
    
    private static final MethodHandle gtk_paper_size_copy = Interop.downcallHandle(
        "gtk_paper_size_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies an existing {@code GtkPaperSize}.
     */
    public @NotNull PaperSize copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paper_size_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PaperSize(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_paper_size_free = Interop.downcallHandle(
        "gtk_paper_size_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Free the given {@code GtkPaperSize} object.
     */
    public @NotNull void free() {
        try {
            gtk_paper_size_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paper_size_get_default_bottom_margin = Interop.downcallHandle(
        "gtk_paper_size_get_default_bottom_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the default bottom margin for the {@code GtkPaperSize}.
     */
    public double getDefaultBottomMargin(@NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_paper_size_get_default_bottom_margin.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_paper_size_get_default_left_margin = Interop.downcallHandle(
        "gtk_paper_size_get_default_left_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the default left margin for the {@code GtkPaperSize}.
     */
    public double getDefaultLeftMargin(@NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_paper_size_get_default_left_margin.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_paper_size_get_default_right_margin = Interop.downcallHandle(
        "gtk_paper_size_get_default_right_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the default right margin for the {@code GtkPaperSize}.
     */
    public double getDefaultRightMargin(@NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_paper_size_get_default_right_margin.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_paper_size_get_default_top_margin = Interop.downcallHandle(
        "gtk_paper_size_get_default_top_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the default top margin for the {@code GtkPaperSize}.
     */
    public double getDefaultTopMargin(@NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_paper_size_get_default_top_margin.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_paper_size_get_display_name = Interop.downcallHandle(
        "gtk_paper_size_get_display_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the human-readable name of the {@code GtkPaperSize}.
     */
    public @NotNull java.lang.String getDisplayName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paper_size_get_display_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_paper_size_get_height = Interop.downcallHandle(
        "gtk_paper_size_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the paper height of the {@code GtkPaperSize}, in
     * units of {@code unit}.
     */
    public double getHeight(@NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_paper_size_get_height.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_paper_size_get_name = Interop.downcallHandle(
        "gtk_paper_size_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the {@code GtkPaperSize}.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paper_size_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_paper_size_get_ppd_name = Interop.downcallHandle(
        "gtk_paper_size_get_ppd_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the PPD name of the {@code GtkPaperSize}, which
     * may be {@code null}.
     */
    public @NotNull java.lang.String getPpdName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paper_size_get_ppd_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_paper_size_get_width = Interop.downcallHandle(
        "gtk_paper_size_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the paper width of the {@code GtkPaperSize}, in
     * units of {@code unit}.
     */
    public double getWidth(@NotNull Unit unit) {
        double RESULT;
        try {
            RESULT = (double) gtk_paper_size_get_width.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_paper_size_is_custom = Interop.downcallHandle(
        "gtk_paper_size_is_custom",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code size} is not a standard paper size.
     */
    public boolean isCustom() {
        int RESULT;
        try {
            RESULT = (int) gtk_paper_size_is_custom.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_paper_size_is_equal = Interop.downcallHandle(
        "gtk_paper_size_is_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two {@code GtkPaperSize} objects.
     */
    public boolean isEqual(@NotNull PaperSize size2) {
        int RESULT;
        try {
            RESULT = (int) gtk_paper_size_is_equal.invokeExact(handle(), size2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_paper_size_is_ipp = Interop.downcallHandle(
        "gtk_paper_size_is_ipp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code size} is an IPP standard paper size.
     */
    public boolean isIpp() {
        int RESULT;
        try {
            RESULT = (int) gtk_paper_size_is_ipp.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_paper_size_set_size = Interop.downcallHandle(
        "gtk_paper_size_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Changes the dimensions of a {@code size} to {@code width} x {@code height}.
     */
    public @NotNull void setSize(@NotNull double width, @NotNull double height, @NotNull Unit unit) {
        try {
            gtk_paper_size_set_size.invokeExact(handle(), width, height, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paper_size_to_gvariant = Interop.downcallHandle(
        "gtk_paper_size_to_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Serialize a paper size to an {@code a{sv}} variant.
     */
    public @NotNull org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paper_size_to_gvariant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_paper_size_to_key_file = Interop.downcallHandle(
        "gtk_paper_size_to_key_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function adds the paper size from {@code size} to {@code key_file}.
     */
    public @NotNull void toKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @NotNull java.lang.String groupName) {
        try {
            gtk_paper_size_to_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_paper_size_get_default = Interop.downcallHandle(
        "gtk_paper_size_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the default paper size, which
     * depends on the current locale.
     */
    public static @NotNull java.lang.String getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paper_size_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_paper_size_get_paper_sizes = Interop.downcallHandle(
        "gtk_paper_size_get_paper_sizes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a list of known paper sizes.
     */
    public static @NotNull org.gtk.glib.List getPaperSizes(@NotNull boolean includeCustom) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_paper_size_get_paper_sizes.invokeExact(includeCustom ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
}
