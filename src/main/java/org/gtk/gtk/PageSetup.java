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
public class PageSetup extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PageSetup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PageSetup */
    public static PageSetup castFrom(org.gtk.gobject.Object gobject) {
        return new PageSetup(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_page_setup_new.invokeExact(), true);
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
    }
    
    private static Refcounted constructNewFromFile(@NotNull java.lang.String fileName) throws GErrorException {
        java.util.Objects.requireNonNull(fileName, "Parameter 'fileName' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_page_setup_new_from_file.invokeExact(Interop.allocateNativeString(fileName), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public static PageSetup newFromFile(@NotNull java.lang.String fileName) throws GErrorException {
        return new PageSetup(constructNewFromFile(fileName));
    }
    
    private static Refcounted constructNewFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        java.util.Objects.requireNonNull(variant, "Parameter 'variant' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_page_setup_new_from_gvariant.invokeExact(variant.handle()), true);
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
    public static PageSetup newFromGvariant(@NotNull org.gtk.glib.Variant variant) {
        return new PageSetup(constructNewFromGvariant(variant));
    }
    
    private static Refcounted constructNewFromKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        java.util.Objects.requireNonNull(keyFile, "Parameter 'keyFile' must not be null");
        java.util.Objects.requireNonNullElse(groupName, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_page_setup_new_from_key_file.invokeExact(keyFile.handle(), Interop.allocateNativeString(groupName), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public static PageSetup newFromKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws GErrorException {
        return new PageSetup(constructNewFromKeyFile(keyFile, groupName));
    }
    
    /**
     * Copies a {@code GtkPageSetup}.
     * @return a copy of {@code other}
     */
    public @NotNull org.gtk.gtk.PageSetup copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSetup(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the bottom margin in units of {@code unit}.
     * @param unit the unit for the return value
     * @return the bottom margin
     */
    public double getBottomMargin(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_bottom_margin.invokeExact(handle(), unit.getValue());
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
    public double getLeftMargin(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_left_margin.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the page orientation of the {@code GtkPageSetup}.
     * @return the page orientation
     */
    public @NotNull org.gtk.gtk.PageOrientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_page_setup_get_orientation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageOrientation(RESULT);
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
    public double getPageHeight(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_page_height.invokeExact(handle(), unit.getValue());
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
    public double getPageWidth(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_page_width.invokeExact(handle(), unit.getValue());
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
    public double getPaperHeight(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_paper_height.invokeExact(handle(), unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the paper size of the {@code GtkPageSetup}.
     * @return the paper size
     */
    public @NotNull org.gtk.gtk.PaperSize getPaperSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_get_paper_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PaperSize(Refcounted.get(RESULT, false));
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
    public double getPaperWidth(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_paper_width.invokeExact(handle(), unit.getValue());
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
    public double getRightMargin(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_right_margin.invokeExact(handle(), unit.getValue());
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
    public double getTopMargin(@NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_page_setup_get_top_margin.invokeExact(handle(), unit.getValue());
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
    public boolean loadFile(@NotNull java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(fileName, "Parameter 'fileName' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_page_setup_load_file.invokeExact(handle(), Interop.allocateNativeString(fileName), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public boolean loadKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(keyFile, "Parameter 'keyFile' must not be null");
        java.util.Objects.requireNonNullElse(groupName, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_page_setup_load_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the bottom margin of the {@code GtkPageSetup}.
     * @param margin the new bottom margin in units of {@code unit}
     * @param unit the units for {@code margin}
     */
    public void setBottomMargin(double margin, @NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        try {
            DowncallHandles.gtk_page_setup_set_bottom_margin.invokeExact(handle(), margin, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the left margin of the {@code GtkPageSetup}.
     * @param margin the new left margin in units of {@code unit}
     * @param unit the units for {@code margin}
     */
    public void setLeftMargin(double margin, @NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        try {
            DowncallHandles.gtk_page_setup_set_left_margin.invokeExact(handle(), margin, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page orientation of the {@code GtkPageSetup}.
     * @param orientation a {@code GtkPageOrientation} value
     */
    public void setOrientation(@NotNull org.gtk.gtk.PageOrientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        try {
            DowncallHandles.gtk_page_setup_set_orientation.invokeExact(handle(), orientation.getValue());
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
    public void setPaperSize(@NotNull org.gtk.gtk.PaperSize size) {
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        try {
            DowncallHandles.gtk_page_setup_set_paper_size.invokeExact(handle(), size.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the paper size of the {@code GtkPageSetup} and modifies
     * the margins according to the new paper size.
     * @param size a {@code GtkPaperSize}
     */
    public void setPaperSizeAndDefaultMargins(@NotNull org.gtk.gtk.PaperSize size) {
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        try {
            DowncallHandles.gtk_page_setup_set_paper_size_and_default_margins.invokeExact(handle(), size.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the right margin of the {@code GtkPageSetup}.
     * @param margin the new right margin in units of {@code unit}
     * @param unit the units for {@code margin}
     */
    public void setRightMargin(double margin, @NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        try {
            DowncallHandles.gtk_page_setup_set_right_margin.invokeExact(handle(), margin, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the top margin of the {@code GtkPageSetup}.
     * @param margin the new top margin in units of {@code unit}
     * @param unit the units for {@code margin}
     */
    public void setTopMargin(double margin, @NotNull org.gtk.gtk.Unit unit) {
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        try {
            DowncallHandles.gtk_page_setup_set_top_margin.invokeExact(handle(), margin, unit.getValue());
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
    public boolean toFile(@NotNull java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(fileName, "Parameter 'fileName' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_page_setup_to_file.invokeExact(handle(), Interop.allocateNativeString(fileName), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Serialize page setup to an a{sv} variant.
     * @return a new, floating, {@code GVariant}
     */
    public @NotNull org.gtk.glib.Variant toGvariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_page_setup_to_gvariant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    /**
     * This function adds the page setup from {@code setup} to {@code key_file}.
     * @param keyFile the {@code GKeyFile} to save the page setup to
     * @param groupName the group to add the settings to in {@code key_file},
     *   or {@code null} to use the default name “Page Setup”
     */
    public void toKeyFile(@NotNull org.gtk.glib.KeyFile keyFile, @Nullable java.lang.String groupName) {
        java.util.Objects.requireNonNull(keyFile, "Parameter 'keyFile' must not be null");
        java.util.Objects.requireNonNullElse(groupName, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_page_setup_to_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_page_setup_new = Interop.downcallHandle(
            "gtk_page_setup_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_new_from_file = Interop.downcallHandle(
            "gtk_page_setup_new_from_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_new_from_gvariant = Interop.downcallHandle(
            "gtk_page_setup_new_from_gvariant",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_new_from_key_file = Interop.downcallHandle(
            "gtk_page_setup_new_from_key_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_copy = Interop.downcallHandle(
            "gtk_page_setup_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_get_bottom_margin = Interop.downcallHandle(
            "gtk_page_setup_get_bottom_margin",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_get_left_margin = Interop.downcallHandle(
            "gtk_page_setup_get_left_margin",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_get_orientation = Interop.downcallHandle(
            "gtk_page_setup_get_orientation",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_get_page_height = Interop.downcallHandle(
            "gtk_page_setup_get_page_height",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_get_page_width = Interop.downcallHandle(
            "gtk_page_setup_get_page_width",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_get_paper_height = Interop.downcallHandle(
            "gtk_page_setup_get_paper_height",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_get_paper_size = Interop.downcallHandle(
            "gtk_page_setup_get_paper_size",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_get_paper_width = Interop.downcallHandle(
            "gtk_page_setup_get_paper_width",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_get_right_margin = Interop.downcallHandle(
            "gtk_page_setup_get_right_margin",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_get_top_margin = Interop.downcallHandle(
            "gtk_page_setup_get_top_margin",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_load_file = Interop.downcallHandle(
            "gtk_page_setup_load_file",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_load_key_file = Interop.downcallHandle(
            "gtk_page_setup_load_key_file",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_set_bottom_margin = Interop.downcallHandle(
            "gtk_page_setup_set_bottom_margin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_set_left_margin = Interop.downcallHandle(
            "gtk_page_setup_set_left_margin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_set_orientation = Interop.downcallHandle(
            "gtk_page_setup_set_orientation",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_set_paper_size = Interop.downcallHandle(
            "gtk_page_setup_set_paper_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_set_paper_size_and_default_margins = Interop.downcallHandle(
            "gtk_page_setup_set_paper_size_and_default_margins",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_set_right_margin = Interop.downcallHandle(
            "gtk_page_setup_set_right_margin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_set_top_margin = Interop.downcallHandle(
            "gtk_page_setup_set_top_margin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_page_setup_to_file = Interop.downcallHandle(
            "gtk_page_setup_to_file",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_to_gvariant = Interop.downcallHandle(
            "gtk_page_setup_to_gvariant",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_page_setup_to_key_file = Interop.downcallHandle(
            "gtk_page_setup_to_key_file",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
