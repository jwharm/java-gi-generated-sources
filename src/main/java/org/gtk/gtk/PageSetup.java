package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkPageSetup} object stores the page size, orientation and margins.
 * <p>
 * The idea is that you can get one of these from the page setup dialog
 * and then pass it to the {@code GtkPrintOperation} when printing.
 * The benefit of splitting this out of the {@code GtkPrintSettings} is that
 * these affect the actual layout of the page, and thus need to be set
 * long before user prints.
 * <p>
 * <strong>Margins</strong><br/>
 * The margins specified in this object are the “print margins”, i.e. the
 * parts of the page that the printer cannot print on. These are different
 * from the layout margins that a word processor uses; they are typically
 * used to determine the minimal size for the layout margins.
 * <p>
 * To obtain a {@code GtkPageSetup} use {@link PageSetup#PageSetup} to get the defaults,
 * or use {@link Gtk#printRunPageSetupDialog} to show the page setup dialog
 * and receive the resulting page setup.
 * <p>
 * <strong>A page setup dialog</strong><br/>
 * <pre>{@code c
 * static GtkPrintSettings *settings = NULL;
 * static GtkPageSetup *page_setup = NULL;
 * 
 * static void
 * do_page_setup (void)
 * {
 *   GtkPageSetup *new_page_setup;
 * 
 *   if (settings == NULL)
 *     settings = gtk_print_settings_new ();
 * 
 *   new_page_setup = gtk_print_run_page_setup_dialog (GTK_WINDOW (main_window),
 *                                                     page_setup, settings);
 * 
 *   if (page_setup)
 *     g_object_unref (page_setup);
 * 
 *   page_setup = new_page_setup;
 * }
 * }</pre>
 */
public class PageSetup extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPageSetup";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PageSetup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PageSetup(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PageSetup> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PageSetup(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPageSetup}.
     */
    public PageSetup() {
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromFile(java.lang.String fileName) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_new_from_file.invokeExact(Marshal.stringToAddress.marshal(fileName, SCOPE),(Addressable) GERROR);
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
     * Reads the page setup from the file {@code file_name}.
     * <p>
     * Returns a new {@code GtkPageSetup} object with the restored
     * page setup, or {@code null} if an error occurred.
     * See {@link PageSetup#toFile}.
     * @param fileName the filename to read the page setup from
     * @return the restored {@code GtkPageSetup}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PageSetup newFromFile(java.lang.String fileName) throws GErrorException {
        var RESULT = constructNewFromFile(fileName);
        var OBJECT = (org.gtk.gtk.PageSetup) Interop.register(RESULT, org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromGvariant(org.gtk.glib.Variant variant) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_new_from_gvariant.invokeExact(variant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Desrialize a page setup from an a{sv} variant.
     * <p>
     * The variant must be in the format produced by
     * {@link PageSetup#toGvariant}.
     * @param variant an a{sv} {@code GVariant}
     * @return a new {@code GtkPageSetup} object
     */
    public static PageSetup newFromGvariant(org.gtk.glib.Variant variant) {
        var RESULT = constructNewFromGvariant(variant);
        var OBJECT = (org.gtk.gtk.PageSetup) Interop.register(RESULT, org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_new_from_key_file.invokeExact(
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
     * Reads the page setup from the group {@code group_name} in the key file
     * {@code key_file}.
     * <p>
     * Returns a new {@code GtkPageSetup} object with the restored
     * page setup, or {@code null} if an error occurred.
     * @param keyFile the {@code GKeyFile} to retrieve the page_setup from
     * @param groupName the name of the group in the key_file to read
     *    to use the default name “Page Setup”
     * @return the restored {@code GtkPageSetup}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PageSetup newFromKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        var RESULT = constructNewFromKeyFile(keyFile, groupName);
        var OBJECT = (org.gtk.gtk.PageSetup) Interop.register(RESULT, org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Copies a {@code GtkPageSetup}.
     * @return a copy of {@code other}
     */
    public org.gtk.gtk.PageSetup copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gtk.PageSetup) Interop.register(RESULT, org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the bottom margin in units of {@code unit}.
     * @param unit the unit for the return value
     * @return the bottom margin
     */
    public double getBottomMargin(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_bottom_margin.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the left margin in units of {@code unit}.
     * @param unit the unit for the return value
     * @return the left margin
     */
    public double getLeftMargin(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_left_margin.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the page orientation of the {@code GtkPageSetup}.
     * @return the page orientation
     */
    public org.gtk.gtk.PageOrientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_page_setup_get_orientation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PageOrientation.of(RESULT);
    }
    
    /**
     * Returns the page height in units of {@code unit}.
     * <p>
     * Note that this function takes orientation
     * and margins into consideration.
     * See {@link PageSetup#getPaperHeight}.
     * @param unit the unit for the return value
     * @return the page height.
     */
    public double getPageHeight(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_page_height.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the page width in units of {@code unit}.
     * <p>
     * Note that this function takes orientation
     * and margins into consideration.
     * See {@link PageSetup#getPaperWidth}.
     * @param unit the unit for the return value
     * @return the page width.
     */
    public double getPageWidth(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_page_width.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the paper height in units of {@code unit}.
     * <p>
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See {@link PageSetup#getPageHeight}.
     * @param unit the unit for the return value
     * @return the paper height.
     */
    public double getPaperHeight(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_paper_height.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the paper size of the {@code GtkPageSetup}.
     * @return the paper size
     */
    public org.gtk.gtk.PaperSize getPaperSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_get_paper_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PaperSize.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the paper width in units of {@code unit}.
     * <p>
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See {@link PageSetup#getPageWidth}.
     * @param unit the unit for the return value
     * @return the paper width.
     */
    public double getPaperWidth(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_paper_width.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the right margin in units of {@code unit}.
     * @param unit the unit for the return value
     * @return the right margin
     */
    public double getRightMargin(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_right_margin.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the top margin in units of {@code unit}.
     * @param unit the unit for the return value
     * @return the top margin
     */
    public double getTopMargin(org.gtk.gtk.Unit unit) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_top_margin.invokeExact(
                    handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Reads the page setup from the file {@code file_name}.
     * <p>
     * See {@link PageSetup#toFile}.
     * @param fileName the filename to read the page setup from
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_page_setup_load_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(fileName, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Reads the page setup from the group {@code group_name} in the key file
     * {@code key_file}.
     * @param keyFile the {@code GKeyFile} to retrieve the page_setup from
     * @param groupName the name of the group in the key_file to read
     *   to use the default name “Page Setup”
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_page_setup_load_key_file.invokeExact(
                        handle(),
                        keyFile.handle(),
                        (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets the bottom margin of the {@code GtkPageSetup}.
     * @param margin the new bottom margin in units of {@code unit}
     * @param unit the units for {@code margin}
     */
    public void setBottomMargin(double margin, org.gtk.gtk.Unit unit) {
        try {
            DowncallHandles.gtk_page_setup_set_bottom_margin.invokeExact(
                    handle(),
                    margin,
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the left margin of the {@code GtkPageSetup}.
     * @param margin the new left margin in units of {@code unit}
     * @param unit the units for {@code margin}
     */
    public void setLeftMargin(double margin, org.gtk.gtk.Unit unit) {
        try {
            DowncallHandles.gtk_page_setup_set_left_margin.invokeExact(
                    handle(),
                    margin,
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page orientation of the {@code GtkPageSetup}.
     * @param orientation a {@code GtkPageOrientation} value
     */
    public void setOrientation(org.gtk.gtk.PageOrientation orientation) {
        try {
            DowncallHandles.gtk_page_setup_set_orientation.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the paper size of the {@code GtkPageSetup} without
     * changing the margins.
     * <p>
     * See {@link PageSetup#setPaperSizeAndDefaultMargins}.
     * @param size a {@code GtkPaperSize}
     */
    public void setPaperSize(org.gtk.gtk.PaperSize size) {
        try {
            DowncallHandles.gtk_page_setup_set_paper_size.invokeExact(
                    handle(),
                    size.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the paper size of the {@code GtkPageSetup} and modifies
     * the margins according to the new paper size.
     * @param size a {@code GtkPaperSize}
     */
    public void setPaperSizeAndDefaultMargins(org.gtk.gtk.PaperSize size) {
        try {
            DowncallHandles.gtk_page_setup_set_paper_size_and_default_margins.invokeExact(
                    handle(),
                    size.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the right margin of the {@code GtkPageSetup}.
     * @param margin the new right margin in units of {@code unit}
     * @param unit the units for {@code margin}
     */
    public void setRightMargin(double margin, org.gtk.gtk.Unit unit) {
        try {
            DowncallHandles.gtk_page_setup_set_right_margin.invokeExact(
                    handle(),
                    margin,
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the top margin of the {@code GtkPageSetup}.
     * @param margin the new top margin in units of {@code unit}
     * @param unit the units for {@code margin}
     */
    public void setTopMargin(double margin, org.gtk.gtk.Unit unit) {
        try {
            DowncallHandles.gtk_page_setup_set_top_margin.invokeExact(
                    handle(),
                    margin,
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function saves the information from {@code setup} to {@code file_name}.
     * @param fileName the file to save to
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean toFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_page_setup_to_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(fileName, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Serialize page setup to an a{sv} variant.
     * @return a new, floating, {@code GVariant}
     */
    public org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_to_gvariant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * This function adds the page setup from {@code setup} to {@code key_file}.
     * @param keyFile the {@code GKeyFile} to save the page setup to
     * @param groupName the group to add the settings to in {@code key_file},
     *   or {@code null} to use the default name “Page Setup”
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_page_setup_to_key_file.invokeExact(
                        handle(),
                        keyFile.handle(),
                        (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_page_setup_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PageSetup.Builder} object constructs a {@link PageSetup} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PageSetup.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PageSetup} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PageSetup}.
         * @return A new instance of {@code PageSetup} with the properties 
         *         that were set in the Builder object.
         */
        public PageSetup build() {
            return (PageSetup) org.gtk.gobject.GObject.newWithProperties(
                PageSetup.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_page_setup_new = Interop.downcallHandle(
                "gtk_page_setup_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_new_from_file = Interop.downcallHandle(
                "gtk_page_setup_new_from_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_new_from_gvariant = Interop.downcallHandle(
                "gtk_page_setup_new_from_gvariant",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_new_from_key_file = Interop.downcallHandle(
                "gtk_page_setup_new_from_key_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_copy = Interop.downcallHandle(
                "gtk_page_setup_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_bottom_margin = Interop.downcallHandle(
                "gtk_page_setup_get_bottom_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_left_margin = Interop.downcallHandle(
                "gtk_page_setup_get_left_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_orientation = Interop.downcallHandle(
                "gtk_page_setup_get_orientation",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_page_height = Interop.downcallHandle(
                "gtk_page_setup_get_page_height",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_page_width = Interop.downcallHandle(
                "gtk_page_setup_get_page_width",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_paper_height = Interop.downcallHandle(
                "gtk_page_setup_get_paper_height",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_paper_size = Interop.downcallHandle(
                "gtk_page_setup_get_paper_size",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_paper_width = Interop.downcallHandle(
                "gtk_page_setup_get_paper_width",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_right_margin = Interop.downcallHandle(
                "gtk_page_setup_get_right_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_top_margin = Interop.downcallHandle(
                "gtk_page_setup_get_top_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_load_file = Interop.downcallHandle(
                "gtk_page_setup_load_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_load_key_file = Interop.downcallHandle(
                "gtk_page_setup_load_key_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_set_bottom_margin = Interop.downcallHandle(
                "gtk_page_setup_set_bottom_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_set_left_margin = Interop.downcallHandle(
                "gtk_page_setup_set_left_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_set_orientation = Interop.downcallHandle(
                "gtk_page_setup_set_orientation",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_set_paper_size = Interop.downcallHandle(
                "gtk_page_setup_set_paper_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_set_paper_size_and_default_margins = Interop.downcallHandle(
                "gtk_page_setup_set_paper_size_and_default_margins",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_set_right_margin = Interop.downcallHandle(
                "gtk_page_setup_set_right_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_set_top_margin = Interop.downcallHandle(
                "gtk_page_setup_set_top_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_page_setup_to_file = Interop.downcallHandle(
                "gtk_page_setup_to_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_to_gvariant = Interop.downcallHandle(
                "gtk_page_setup_to_gvariant",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_to_key_file = Interop.downcallHandle(
                "gtk_page_setup_to_key_file",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_page_setup_get_type = Interop.downcallHandle(
                "gtk_page_setup_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_page_setup_get_type != null;
    }
}
