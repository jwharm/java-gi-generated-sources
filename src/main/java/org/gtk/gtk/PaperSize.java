package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle gtk_paper_size_new = Interop.downcallHandle(
        "gtk_paper_size_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String name) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new.invokeExact(Interop.allocateNativeString(name).handle()), true);
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
    public PaperSize(java.lang.String name) {
        super(constructNew(name));
    }
    
    static final MethodHandle gtk_paper_size_new_custom = Interop.downcallHandle(
        "gtk_paper_size_new_custom",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewCustom(java.lang.String name, java.lang.String displayName, double width, double height, Unit unit) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_custom.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(displayName).handle(), width, height, unit.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPaperSize} object with the
     * given parameters.
     */
    public static PaperSize newCustom(java.lang.String name, java.lang.String displayName, double width, double height, Unit unit) {
        return new PaperSize(constructNewCustom(name, displayName, width, height, unit));
    }
    
    static final MethodHandle gtk_paper_size_new_from_gvariant = Interop.downcallHandle(
        "gtk_paper_size_new_from_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromGvariant(org.gtk.glib.Variant variant) {
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
    public static PaperSize newFromGvariant(org.gtk.glib.Variant variant) {
        return new PaperSize(constructNewFromGvariant(variant));
    }
    
    static final MethodHandle gtk_paper_size_new_from_ipp = Interop.downcallHandle(
        "gtk_paper_size_new_from_ipp",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    private static Refcounted constructNewFromIpp(java.lang.String ippName, double width, double height) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_from_ipp.invokeExact(Interop.allocateNativeString(ippName).handle(), width, height), true);
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
    public static PaperSize newFromIpp(java.lang.String ippName, double width, double height) {
        return new PaperSize(constructNewFromIpp(ippName, width, height));
    }
    
    static final MethodHandle gtk_paper_size_new_from_key_file = Interop.downcallHandle(
        "gtk_paper_size_new_from_key_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_from_key_file.invokeExact(keyFile.handle(), Interop.allocateNativeString(groupName).handle(), GERROR), true);
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
    public static PaperSize newFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        return new PaperSize(constructNewFromKeyFile(keyFile, groupName));
    }
    
    static final MethodHandle gtk_paper_size_new_from_ppd = Interop.downcallHandle(
        "gtk_paper_size_new_from_ppd",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    private static Refcounted constructNewFromPpd(java.lang.String ppdName, java.lang.String ppdDisplayName, double width, double height) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_paper_size_new_from_ppd.invokeExact(Interop.allocateNativeString(ppdName).handle(), Interop.allocateNativeString(ppdDisplayName).handle(), width, height), true);
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
    public static PaperSize newFromPpd(java.lang.String ppdName, java.lang.String ppdDisplayName, double width, double height) {
        return new PaperSize(constructNewFromPpd(ppdName, ppdDisplayName, width, height));
    }
    
    static final MethodHandle gtk_paper_size_copy = Interop.downcallHandle(
        "gtk_paper_size_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies an existing {@code GtkPaperSize}.
     */
    public PaperSize copy() {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_copy.invokeExact(handle());
            return new PaperSize(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_free = Interop.downcallHandle(
        "gtk_paper_size_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Free the given {@code GtkPaperSize} object.
     */
    public void free() {
        try {
            gtk_paper_size_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_default_bottom_margin = Interop.downcallHandle(
        "gtk_paper_size_get_default_bottom_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the default bottom margin for the {@code GtkPaperSize}.
     */
    public double getDefaultBottomMargin(Unit unit) {
        try {
            var RESULT = (double) gtk_paper_size_get_default_bottom_margin.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_default_left_margin = Interop.downcallHandle(
        "gtk_paper_size_get_default_left_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the default left margin for the {@code GtkPaperSize}.
     */
    public double getDefaultLeftMargin(Unit unit) {
        try {
            var RESULT = (double) gtk_paper_size_get_default_left_margin.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_default_right_margin = Interop.downcallHandle(
        "gtk_paper_size_get_default_right_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the default right margin for the {@code GtkPaperSize}.
     */
    public double getDefaultRightMargin(Unit unit) {
        try {
            var RESULT = (double) gtk_paper_size_get_default_right_margin.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_default_top_margin = Interop.downcallHandle(
        "gtk_paper_size_get_default_top_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the default top margin for the {@code GtkPaperSize}.
     */
    public double getDefaultTopMargin(Unit unit) {
        try {
            var RESULT = (double) gtk_paper_size_get_default_top_margin.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_display_name = Interop.downcallHandle(
        "gtk_paper_size_get_display_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the human-readable name of the {@code GtkPaperSize}.
     */
    public java.lang.String getDisplayName() {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_get_display_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_height = Interop.downcallHandle(
        "gtk_paper_size_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the paper height of the {@code GtkPaperSize}, in
     * units of {@code unit}.
     */
    public double getHeight(Unit unit) {
        try {
            var RESULT = (double) gtk_paper_size_get_height.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_name = Interop.downcallHandle(
        "gtk_paper_size_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the {@code GtkPaperSize}.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_ppd_name = Interop.downcallHandle(
        "gtk_paper_size_get_ppd_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the PPD name of the {@code GtkPaperSize}, which
     * may be {@code null}.
     */
    public java.lang.String getPpdName() {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_get_ppd_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_width = Interop.downcallHandle(
        "gtk_paper_size_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the paper width of the {@code GtkPaperSize}, in
     * units of {@code unit}.
     */
    public double getWidth(Unit unit) {
        try {
            var RESULT = (double) gtk_paper_size_get_width.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_is_custom = Interop.downcallHandle(
        "gtk_paper_size_is_custom",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code size} is not a standard paper size.
     */
    public boolean isCustom() {
        try {
            var RESULT = (int) gtk_paper_size_is_custom.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_is_equal = Interop.downcallHandle(
        "gtk_paper_size_is_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two {@code GtkPaperSize} objects.
     */
    public boolean isEqual(PaperSize size2) {
        try {
            var RESULT = (int) gtk_paper_size_is_equal.invokeExact(handle(), size2.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_is_ipp = Interop.downcallHandle(
        "gtk_paper_size_is_ipp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code size} is an IPP standard paper size.
     */
    public boolean isIpp() {
        try {
            var RESULT = (int) gtk_paper_size_is_ipp.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_set_size = Interop.downcallHandle(
        "gtk_paper_size_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Changes the dimensions of a {@code size} to {@code width} x {@code height}.
     */
    public void setSize(double width, double height, Unit unit) {
        try {
            gtk_paper_size_set_size.invokeExact(handle(), width, height, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_to_gvariant = Interop.downcallHandle(
        "gtk_paper_size_to_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Serialize a paper size to an {@code a{sv}} variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_to_gvariant.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_to_key_file = Interop.downcallHandle(
        "gtk_paper_size_to_key_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function adds the paper size from {@code size} to {@code key_file}.
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        try {
            gtk_paper_size_to_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_default = Interop.downcallHandle(
        "gtk_paper_size_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the default paper size, which
     * depends on the current locale.
     */
    public static java.lang.String getDefault() {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_get_default.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_paper_size_get_paper_sizes = Interop.downcallHandle(
        "gtk_paper_size_get_paper_sizes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a list of known paper sizes.
     */
    public static org.gtk.glib.List getPaperSizes(boolean includeCustom) {
        try {
            var RESULT = (MemoryAddress) gtk_paper_size_get_paper_sizes.invokeExact(includeCustom ? 1 : 0);
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
