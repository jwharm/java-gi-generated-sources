package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkPageSetup} object stores the page size, orientation and margins.
 * <p>
 * The idea is that you can get one of these from the page setup dialog
 * and then pass it to the {@code GtkPrintOperation} when printing.
 * The benefit of splitting this out of the {@code GtkPrintSettings} is that
 * these affect the actual layout of the page, and thus need to be set
 * long before user prints.
 * <p>
 * <h2>Margins</h2>
 * <p>
 * The margins specified in this object are the “print margins”, i.e. the
 * parts of the page that the printer cannot print on. These are different
 * from the layout margins that a word processor uses; they are typically
 * used to determine the minimal size for the layout margins.
 * <p>
 * To obtain a {@code GtkPageSetup} use {@link PageSetup#PageSetup} to get the defaults,
 * or use {@link Gtk#printRunPageSetupDialog} to show the page setup dialog
 * and receive the resulting page setup.
 * <p>
 * <h2>A page setup dialog</h2>
 * <p>
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

    public PageSetup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PageSetup */
    public static PageSetup castFrom(org.gtk.gobject.Object gobject) {
        return new PageSetup(gobject.refcounted());
    }
    
    static final MethodHandle gtk_page_setup_new = Interop.downcallHandle(
        "gtk_page_setup_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_page_setup_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPageSetup}.
     */
    public PageSetup() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_page_setup_new_from_file = Interop.downcallHandle(
        "gtk_page_setup_new_from_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromFile(java.lang.String fileName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_page_setup_new_from_file.invokeExact(Interop.allocateNativeString(fileName).handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reads the page setup from the file {@code file_name}.
     * <p>
     * Returns a new {@code GtkPageSetup} object with the restored
     * page setup, or {@code null} if an error occurred.
     * See {@link PageSetup#toFile}.
     */
    public static PageSetup newFromFile(java.lang.String fileName) throws GErrorException {
        return new PageSetup(constructNewFromFile(fileName));
    }
    
    static final MethodHandle gtk_page_setup_new_from_gvariant = Interop.downcallHandle(
        "gtk_page_setup_new_from_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromGvariant(org.gtk.glib.Variant variant) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_page_setup_new_from_gvariant.invokeExact(variant.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Desrialize a page setup from an a{sv} variant.
     * <p>
     * The variant must be in the format produced by
     * {@link PageSetup#toGvariant}.
     */
    public static PageSetup newFromGvariant(org.gtk.glib.Variant variant) {
        return new PageSetup(constructNewFromGvariant(variant));
    }
    
    static final MethodHandle gtk_page_setup_new_from_key_file = Interop.downcallHandle(
        "gtk_page_setup_new_from_key_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_page_setup_new_from_key_file.invokeExact(keyFile.handle(), Interop.allocateNativeString(groupName).handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reads the page setup from the group {@code group_name} in the key file
     * {@code key_file}.
     * <p>
     * Returns a new {@code GtkPageSetup} object with the restored
     * page setup, or {@code null} if an error occurred.
     */
    public static PageSetup newFromKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws GErrorException {
        return new PageSetup(constructNewFromKeyFile(keyFile, groupName));
    }
    
    static final MethodHandle gtk_page_setup_copy = Interop.downcallHandle(
        "gtk_page_setup_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code GtkPageSetup}.
     */
    public PageSetup copy() {
        try {
            var RESULT = (MemoryAddress) gtk_page_setup_copy.invokeExact(handle());
            return new PageSetup(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_bottom_margin = Interop.downcallHandle(
        "gtk_page_setup_get_bottom_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the bottom margin in units of {@code unit}.
     */
    public double getBottomMargin(Unit unit) {
        try {
            var RESULT = (double) gtk_page_setup_get_bottom_margin.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_left_margin = Interop.downcallHandle(
        "gtk_page_setup_get_left_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the left margin in units of {@code unit}.
     */
    public double getLeftMargin(Unit unit) {
        try {
            var RESULT = (double) gtk_page_setup_get_left_margin.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_orientation = Interop.downcallHandle(
        "gtk_page_setup_get_orientation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the page orientation of the {@code GtkPageSetup}.
     */
    public PageOrientation getOrientation() {
        try {
            var RESULT = (int) gtk_page_setup_get_orientation.invokeExact(handle());
            return new PageOrientation(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_page_height = Interop.downcallHandle(
        "gtk_page_setup_get_page_height",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the page height in units of {@code unit}.
     * <p>
     * Note that this function takes orientation
     * and margins into consideration.
     * See {@link PageSetup#getPaperHeight}.
     */
    public double getPageHeight(Unit unit) {
        try {
            var RESULT = (double) gtk_page_setup_get_page_height.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_page_width = Interop.downcallHandle(
        "gtk_page_setup_get_page_width",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the page width in units of {@code unit}.
     * <p>
     * Note that this function takes orientation
     * and margins into consideration.
     * See {@link PageSetup#getPaperWidth}.
     */
    public double getPageWidth(Unit unit) {
        try {
            var RESULT = (double) gtk_page_setup_get_page_width.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_paper_height = Interop.downcallHandle(
        "gtk_page_setup_get_paper_height",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the paper height in units of {@code unit}.
     * <p>
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See {@link PageSetup#getPageHeight}.
     */
    public double getPaperHeight(Unit unit) {
        try {
            var RESULT = (double) gtk_page_setup_get_paper_height.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_paper_size = Interop.downcallHandle(
        "gtk_page_setup_get_paper_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the paper size of the {@code GtkPageSetup}.
     */
    public PaperSize getPaperSize() {
        try {
            var RESULT = (MemoryAddress) gtk_page_setup_get_paper_size.invokeExact(handle());
            return new PaperSize(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_paper_width = Interop.downcallHandle(
        "gtk_page_setup_get_paper_width",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the paper width in units of {@code unit}.
     * <p>
     * Note that this function takes orientation,
     * but not margins into consideration.
     * See {@link PageSetup#getPageWidth}.
     */
    public double getPaperWidth(Unit unit) {
        try {
            var RESULT = (double) gtk_page_setup_get_paper_width.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_right_margin = Interop.downcallHandle(
        "gtk_page_setup_get_right_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the right margin in units of {@code unit}.
     */
    public double getRightMargin(Unit unit) {
        try {
            var RESULT = (double) gtk_page_setup_get_right_margin.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_get_top_margin = Interop.downcallHandle(
        "gtk_page_setup_get_top_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the top margin in units of {@code unit}.
     */
    public double getTopMargin(Unit unit) {
        try {
            var RESULT = (double) gtk_page_setup_get_top_margin.invokeExact(handle(), unit.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_load_file = Interop.downcallHandle(
        "gtk_page_setup_load_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads the page setup from the file {@code file_name}.
     * <p>
     * See {@link PageSetup#toFile}.
     */
    public boolean loadFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_page_setup_load_file.invokeExact(handle(), Interop.allocateNativeString(fileName).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_load_key_file = Interop.downcallHandle(
        "gtk_page_setup_load_key_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads the page setup from the group {@code group_name} in the key file
     * {@code key_file}.
     */
    public boolean loadKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_page_setup_load_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_set_bottom_margin = Interop.downcallHandle(
        "gtk_page_setup_set_bottom_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the bottom margin of the {@code GtkPageSetup}.
     */
    public void setBottomMargin(double margin, Unit unit) {
        try {
            gtk_page_setup_set_bottom_margin.invokeExact(handle(), margin, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_set_left_margin = Interop.downcallHandle(
        "gtk_page_setup_set_left_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the left margin of the {@code GtkPageSetup}.
     */
    public void setLeftMargin(double margin, Unit unit) {
        try {
            gtk_page_setup_set_left_margin.invokeExact(handle(), margin, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_set_orientation = Interop.downcallHandle(
        "gtk_page_setup_set_orientation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the page orientation of the {@code GtkPageSetup}.
     */
    public void setOrientation(PageOrientation orientation) {
        try {
            gtk_page_setup_set_orientation.invokeExact(handle(), orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_set_paper_size = Interop.downcallHandle(
        "gtk_page_setup_set_paper_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the paper size of the {@code GtkPageSetup} without
     * changing the margins.
     * <p>
     * See {@link PageSetup#setPaperSizeAndDefaultMargins}.
     */
    public void setPaperSize(PaperSize size) {
        try {
            gtk_page_setup_set_paper_size.invokeExact(handle(), size.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_set_paper_size_and_default_margins = Interop.downcallHandle(
        "gtk_page_setup_set_paper_size_and_default_margins",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the paper size of the {@code GtkPageSetup} and modifies
     * the margins according to the new paper size.
     */
    public void setPaperSizeAndDefaultMargins(PaperSize size) {
        try {
            gtk_page_setup_set_paper_size_and_default_margins.invokeExact(handle(), size.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_set_right_margin = Interop.downcallHandle(
        "gtk_page_setup_set_right_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the right margin of the {@code GtkPageSetup}.
     */
    public void setRightMargin(double margin, Unit unit) {
        try {
            gtk_page_setup_set_right_margin.invokeExact(handle(), margin, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_set_top_margin = Interop.downcallHandle(
        "gtk_page_setup_set_top_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the top margin of the {@code GtkPageSetup}.
     */
    public void setTopMargin(double margin, Unit unit) {
        try {
            gtk_page_setup_set_top_margin.invokeExact(handle(), margin, unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_to_file = Interop.downcallHandle(
        "gtk_page_setup_to_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function saves the information from {@code setup} to {@code file_name}.
     */
    public boolean toFile(java.lang.String fileName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_page_setup_to_file.invokeExact(handle(), Interop.allocateNativeString(fileName).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_to_gvariant = Interop.downcallHandle(
        "gtk_page_setup_to_gvariant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Serialize page setup to an a{sv} variant.
     */
    public org.gtk.glib.Variant toGvariant() {
        try {
            var RESULT = (MemoryAddress) gtk_page_setup_to_gvariant.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_page_setup_to_key_file = Interop.downcallHandle(
        "gtk_page_setup_to_key_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function adds the page setup from {@code setup} to {@code key_file}.
     */
    public void toKeyFile(org.gtk.glib.KeyFile keyFile, java.lang.String groupName) {
        try {
            gtk_page_setup_to_key_file.invokeExact(handle(), keyFile.handle(), Interop.allocateNativeString(groupName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
