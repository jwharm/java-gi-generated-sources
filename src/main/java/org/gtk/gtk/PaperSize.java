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
public class PaperSize extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPaperSize";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PaperSize}
     * @return A new, uninitialized @{link PaperSize}
     */
    public static PaperSize allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PaperSize newInstance = new PaperSize(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PaperSize proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PaperSize(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PaperSize> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PaperSize(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_new.invokeExact((Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@code GtkPaperSize} object by parsing a
     * <a href="ftp://ftp.pwg.org/pub/pwg/candidates/cs-pwgmsn10-20020226-5101.1.pdf">PWG 5101.1-2002</a>
     * paper name.
     * <p>
     * If {@code name} is {@code null}, the default paper size is returned,
     * see {@link PaperSize#getDefault}.
     * @param name a paper size name
     */
    public PaperSize(@Nullable java.lang.String name) {
        super(constructNew(name));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewCustom(java.lang.String name, java.lang.String displayName, double width, double height, org.gtk.gtk.Unit unit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_new_custom.invokeExact(
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.stringToAddress.marshal(displayName, SCOPE),
                        width,
                        height,
                        unit.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkPaperSize} object with the
     * given parameters.
     * @param name the paper name
     * @param displayName the human-readable name
     * @param width the paper width, in units of {@code unit}
     * @param height the paper height, in units of {@code unit}
     * @param unit the unit for {@code width} and {@code height}. not {@link Unit#NONE}.
     * @return a new {@code GtkPaperSize} object, use {@link PaperSize#free}
     * to free it
     */
    public static PaperSize newCustom(java.lang.String name, java.lang.String displayName, double width, double height, org.gtk.gtk.Unit unit) {
        var RESULT = constructNewCustom(name, displayName, width, height, unit);
        var OBJECT = org.gtk.gtk.PaperSize.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromGvariant(org.gtk.glib.Variant variant) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_new_from_gvariant.invokeExact(variant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Deserialize a paper size from a {@code GVariant}.
     * <p>
     * The `GVariant must be in the format produced by
     * {@link PaperSize#toGvariant}.
     * @param variant an a{sv} {@code GVariant}
     * @return a new {@code GtkPaperSize} object
     */
    public static PaperSize newFromGvariant(org.gtk.glib.Variant variant) {
        var RESULT = constructNewFromGvariant(variant);
        var OBJECT = org.gtk.gtk.PaperSize.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromIpp(java.lang.String ippName, double width, double height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_new_from_ipp.invokeExact(
                        Marshal.stringToAddress.marshal(ippName, SCOPE),
                        width,
                        height);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkPaperSize} object by using
     * IPP information.
     * <p>
     * If {@code ipp_name} is not a recognized paper name,
     * {@code width} and {@code height} are used to
     * construct a custom {@code GtkPaperSize} object.
     * @param ippName an IPP paper name
     * @param width the paper width, in points
     * @param height the paper height in points
     * @return a new {@code GtkPaperSize}, use {@link PaperSize#free}
     * to free it
     */
    public static PaperSize newFromIpp(java.lang.String ippName, double width, double height) {
        var RESULT = constructNewFromIpp(ippName, width, height);
        var OBJECT = org.gtk.gtk.PaperSize.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_new_from_key_file.invokeExact(
                        keyFile.handle(),
                        (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Reads a paper size from the group {@code group_name} in the key file
     * {@code key_file}.
     * @param keyFile the {@code GKeyFile} to retrieve the papersize from
     * @param groupName the name of the group in the key file to read,
     *   or {@code null} to read the first group
     * @return a new {@code GtkPaperSize} object with the restored paper size
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PaperSize newFromKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        var RESULT = constructNewFromKeyFile(keyFile, groupName);
        var OBJECT = org.gtk.gtk.PaperSize.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromPpd(java.lang.String ppdName, java.lang.String ppdDisplayName, double width, double height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_new_from_ppd.invokeExact(
                        Marshal.stringToAddress.marshal(ppdName, SCOPE),
                        Marshal.stringToAddress.marshal(ppdDisplayName, SCOPE),
                        width,
                        height);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkPaperSize} object by using
     * PPD information.
     * <p>
     * If {@code ppd_name} is not a recognized PPD paper name,
     * {@code ppd_display_name}, {@code width} and {@code height} are used to
     * construct a custom {@code GtkPaperSize} object.
     * @param ppdName a PPD paper name
     * @param ppdDisplayName the corresponding human-readable name
     * @param width the paper width, in points
     * @param height the paper height in points
     * @return a new {@code GtkPaperSize}, use {@link PaperSize#free}
     * to free it
     */
    public static PaperSize newFromPpd(java.lang.String ppdName, java.lang.String ppdDisplayName, double width, double height) {
        var RESULT = constructNewFromPpd(ppdName, ppdDisplayName, width, height);
        var OBJECT = org.gtk.gtk.PaperSize.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Copies an existing {@code GtkPaperSize}.
     * @return a copy of {@code other}
     */
    public org.gtk.gtk.PaperSize copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gtk.PaperSize.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Free the given {@code GtkPaperSize} object.
     */
    public void free() {
        try {
            DowncallHandles.gtk_paper_size_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the default bottom margin for the {@code GtkPaperSize}.
     * @param unit the unit for the return value, not {@link Unit#NONE}
     * @return the default bottom margin
     */
    public double getDefaultBottomMargin(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_paper_size_get_default_bottom_margin.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the default left margin for the {@code GtkPaperSize}.
     * @param unit the unit for the return value, not {@link Unit#NONE}
     * @return the default left margin
     */
    public double getDefaultLeftMargin(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_paper_size_get_default_left_margin.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the default right margin for the {@code GtkPaperSize}.
     * @param unit the unit for the return value, not {@link Unit#NONE}
     * @return the default right margin
     */
    public double getDefaultRightMargin(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_paper_size_get_default_right_margin.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the default top margin for the {@code GtkPaperSize}.
     * @param unit the unit for the return value, not {@link Unit#NONE}
     * @return the default top margin
     */
    public double getDefaultTopMargin(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_paper_size_get_default_top_margin.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the human-readable name of the {@code GtkPaperSize}.
     * @return the human-readable name of {@code size}
     */
    public java.lang.String getDisplayName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_display_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the paper height of the {@code GtkPaperSize}, in
     * units of {@code unit}.
     * @param unit the unit for the return value, not {@link Unit#NONE}
     * @return the paper height
     */
    public double getHeight(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_paper_size_get_height.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the name of the {@code GtkPaperSize}.
     * @return the name of {@code size}
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the PPD name of the {@code GtkPaperSize}, which
     * may be {@code null}.
     * @return the PPD name of {@code size}
     */
    public java.lang.String getPpdName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_ppd_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the paper width of the {@code GtkPaperSize}, in
     * units of {@code unit}.
     * @param unit the unit for the return value, not {@link Unit#NONE}
     * @return the paper width
     */
    public double getWidth(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_paper_size_get_width.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@code true} if {@code size} is not a standard paper size.
     * @return whether {@code size} is a custom paper size.
     */
    public boolean isCustom() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paper_size_is_custom.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Compares two {@code GtkPaperSize} objects.
     * @param size2 another {@code GtkPaperSize} object
     * @return {@code true}, if {@code size1} and {@code size2}
     * represent the same paper size
     */
    public boolean isEqual(org.gtk.gtk.PaperSize size2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paper_size_is_equal.invokeExact(
                    handle(),
                    size2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if {@code size} is an IPP standard paper size.
     * @return whether {@code size} is not an IPP custom paper size.
     */
    public boolean isIpp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_paper_size_is_ipp.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Changes the dimensions of a {@code size} to {@code width} x {@code height}.
     * @param width the new width in units of {@code unit}
     * @param height the new height in units of {@code unit}
     * @param unit the unit for {@code width} and {@code height}
     */
    public void setSize(double width, double height, org.gtk.gtk.Unit unit) {
        try {
            DowncallHandles.gtk_paper_size_set_size.invokeExact(
                    handle(),
                    width,
                    height,
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Serialize a paper size to an {@code a{sv}} variant.
     * @return a new, floating, {@code GVariant}
     */
    public org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_to_gvariant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * This function adds the paper size from {@code size} to {@code key_file}.
     * @param keyFile the {@code GKeyFile} to save the paper size to
     * @param groupName the group to add the settings to in {@code key_file}
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_paper_size_to_key_file.invokeExact(
                        handle(),
                        keyFile.handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Returns the name of the default paper size, which
     * depends on the current locale.
     * @return the name of the default paper size. The string
     * is owned by GTK and should not be modified.
     */
    public static java.lang.String getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a list of known paper sizes.
     * @param includeCustom whether to include custom paper sizes
     *   as defined in the page setup dialog
     * @return a newly allocated list of newly
     *    allocated {@code GtkPaperSize} objects
     */
    public static org.gtk.glib.List getPaperSizes(boolean includeCustom) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_paper_size_get_paper_sizes.invokeExact(Marshal.booleanToInteger.marshal(includeCustom, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_paper_size_new = Interop.downcallHandle(
                "gtk_paper_size_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_new_custom = Interop.downcallHandle(
                "gtk_paper_size_new_custom",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paper_size_new_from_gvariant = Interop.downcallHandle(
                "gtk_paper_size_new_from_gvariant",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_new_from_ipp = Interop.downcallHandle(
                "gtk_paper_size_new_from_ipp",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_paper_size_new_from_key_file = Interop.downcallHandle(
                "gtk_paper_size_new_from_key_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_new_from_ppd = Interop.downcallHandle(
                "gtk_paper_size_new_from_ppd",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_paper_size_copy = Interop.downcallHandle(
                "gtk_paper_size_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_free = Interop.downcallHandle(
                "gtk_paper_size_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_default_bottom_margin = Interop.downcallHandle(
                "gtk_paper_size_get_default_bottom_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_default_left_margin = Interop.downcallHandle(
                "gtk_paper_size_get_default_left_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_default_right_margin = Interop.downcallHandle(
                "gtk_paper_size_get_default_right_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_default_top_margin = Interop.downcallHandle(
                "gtk_paper_size_get_default_top_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_display_name = Interop.downcallHandle(
                "gtk_paper_size_get_display_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_height = Interop.downcallHandle(
                "gtk_paper_size_get_height",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_name = Interop.downcallHandle(
                "gtk_paper_size_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_ppd_name = Interop.downcallHandle(
                "gtk_paper_size_get_ppd_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_width = Interop.downcallHandle(
                "gtk_paper_size_get_width",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paper_size_is_custom = Interop.downcallHandle(
                "gtk_paper_size_is_custom",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_is_equal = Interop.downcallHandle(
                "gtk_paper_size_is_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_is_ipp = Interop.downcallHandle(
                "gtk_paper_size_is_ipp",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_set_size = Interop.downcallHandle(
                "gtk_paper_size_set_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_paper_size_to_gvariant = Interop.downcallHandle(
                "gtk_paper_size_to_gvariant",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_to_key_file = Interop.downcallHandle(
                "gtk_paper_size_to_key_file",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_default = Interop.downcallHandle(
                "gtk_paper_size_get_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_paper_size_get_paper_sizes = Interop.downcallHandle(
                "gtk_paper_size_get_paper_sizes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
