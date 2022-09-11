package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkPrinter` object represents a printer.
 * 
 * You only need to deal directly with printers if you use the
 * non-portable [class@Gtk.PrintUnixDialog] API.
 * 
 * A `GtkPrinter` allows to get status information about the printer,
 * such as its description, its location, the number of queued jobs,
 * etc. Most importantly, a `GtkPrinter` object can be used to create
 * a [class@Gtk.PrintJob] object, which lets you print to the printer.
 */
public class Printer extends org.gtk.gobject.Object {

    public Printer(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Printer */
    public static Printer castFrom(org.gtk.gobject.Object gobject) {
        return new Printer(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkPrinter`.
     */
    public Printer(java.lang.String name, PrintBackend backend, boolean virtual) {
        super(References.get(gtk_h.gtk_printer_new(Interop.allocateNativeString(name).handle(), backend.handle(), virtual ? 1 : 0), true));
    }
    
    /**
     * Returns whether the printer accepts input in
     * PDF format.
     */
    public boolean acceptsPdf() {
        var RESULT = gtk_h.gtk_printer_accepts_pdf(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer accepts input in
     * PostScript format.
     */
    public boolean acceptsPs() {
        var RESULT = gtk_h.gtk_printer_accepts_ps(handle());
        return (RESULT != 0);
    }
    
    /**
     * Compares two printers.
     */
    public int compare(Printer b) {
        var RESULT = gtk_h.gtk_printer_compare(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Returns the backend of the printer.
     */
    public PrintBackend getBackend() {
        var RESULT = gtk_h.gtk_printer_get_backend(handle());
        return new PrintBackend(References.get(RESULT, false));
    }
    
    /**
     * Returns the printer’s capabilities.
     * 
     * This is useful when you’re using `GtkPrintUnixDialog`’s
     * manual-capabilities setting and need to know which settings
     * the printer can handle and which you must handle yourself.
     * 
     * This will return 0 unless the printer’s details are
     * available, see [method@Gtk.Printer.has_details] and
     * [method@Gtk.Printer.request_details].
     */
    public int getCapabilities() {
        var RESULT = gtk_h.gtk_printer_get_capabilities(handle());
        return RESULT;
    }
    
    /**
     * Returns default page size of @printer.
     */
    public PageSetup getDefaultPageSize() {
        var RESULT = gtk_h.gtk_printer_get_default_page_size(handle());
        return new PageSetup(References.get(RESULT, true));
    }
    
    /**
     * Gets the description of the printer.
     */
    public java.lang.String getDescription() {
        var RESULT = gtk_h.gtk_printer_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of the icon to use for the printer.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.gtk_printer_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the number of jobs currently queued on the printer.
     */
    public int getJobCount() {
        var RESULT = gtk_h.gtk_printer_get_job_count(handle());
        return RESULT;
    }
    
    /**
     * Returns a description of the location of the printer.
     */
    public java.lang.String getLocation() {
        var RESULT = gtk_h.gtk_printer_get_location(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the name of the printer.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_printer_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the state message describing the current state
     * of the printer.
     */
    public java.lang.String getStateMessage() {
        var RESULT = gtk_h.gtk_printer_get_state_message(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the printer details are available.
     */
    public boolean hasDetails() {
        var RESULT = gtk_h.gtk_printer_has_details(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is accepting jobs
     */
    public boolean isAcceptingJobs() {
        var RESULT = gtk_h.gtk_printer_is_accepting_jobs(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is currently active (i.e.
     * accepts new jobs).
     */
    public boolean isActive() {
        var RESULT = gtk_h.gtk_printer_is_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is the default printer.
     */
    public boolean isDefault() {
        var RESULT = gtk_h.gtk_printer_is_default(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is currently paused.
     * 
     * A paused printer still accepts jobs, but it is not
     * printing them.
     */
    public boolean isPaused() {
        var RESULT = gtk_h.gtk_printer_is_paused(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the printer is virtual (i.e. does not
     * represent actual printer hardware, but something like
     * a CUPS class).
     */
    public boolean isVirtual() {
        var RESULT = gtk_h.gtk_printer_is_virtual(handle());
        return (RESULT != 0);
    }
    
    /**
     * Lists all the paper sizes @printer supports.
     * 
     * This will return and empty list unless the printer’s details
     * are available, see [method@Gtk.Printer.has_details] and
     * [method@Gtk.Printer.request_details].
     */
    public org.gtk.glib.List listPapers() {
        var RESULT = gtk_h.gtk_printer_list_papers(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Requests the printer details.
     * 
     * When the details are available, the
     * [signal@Gtk.Printer::details-acquired] signal
     * will be emitted on @printer.
     */
    public void requestDetails() {
        gtk_h.gtk_printer_request_details(handle());
    }
    
    @FunctionalInterface
    public interface DetailsAcquiredHandler {
        void signalReceived(Printer source, boolean success);
    }
    
    /**
     * Emitted in response to a request for detailed information
     * about a printer from the print backend.
     * 
     * The @success parameter indicates if the information was
     * actually obtained.
     */
    public void onDetailsAcquired(DetailsAcquiredHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrinterDetailsAcquired", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("details-acquired").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
