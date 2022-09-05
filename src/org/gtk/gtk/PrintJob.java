package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkPrintJob` object represents a job that is sent to a printer.
 * 
 * You only need to deal directly with print jobs if you use the
 * non-portable [class@Gtk.PrintUnixDialog] API.
 * 
 * Use [method@Gtk.PrintJob.get_surface] to obtain the cairo surface
 * onto which the pages must be drawn. Use [method@Gtk.PrintJob.send]
 * to send the finished job to the printer. If you don’t use cairo
 * `GtkPrintJob` also supports printing of manually generated PostScript,
 * via [method@Gtk.PrintJob.set_source_file].
 */
public class PrintJob extends org.gtk.gobject.Object {

    public PrintJob(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PrintJob */
    public static PrintJob castFrom(org.gtk.gobject.Object gobject) {
        return new PrintJob(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkPrintJob`.
     */
    public PrintJob(java.lang.String title, Printer printer, PrintSettings settings, PageSetup pageSetup) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_new(Interop.getAllocator().allocateUtf8String(title), printer.HANDLE(), settings.HANDLE(), pageSetup.HANDLE()), true));
    }
    
    /**
     * Gets whether this job is printed collated.
     */
    public boolean getCollate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_collate(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the n-up setting for this job.
     */
    public int getNUp() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_n_up(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the n-up layout setting for this job.
     */
    public NumberUpLayout getNUpLayout() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_n_up_layout(HANDLE());
        return NumberUpLayout.fromValue(RESULT);
    }
    
    /**
     * Gets the number of copies of this job.
     */
    public int getNumCopies() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_num_copies(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the `GtkPageSet` setting for this job.
     */
    public PageSet getPageSet() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_page_set(HANDLE());
        return PageSet.fromValue(RESULT);
    }
    
    /**
     * Gets the `GtkPrintPages` setting for this job.
     */
    public PrintPages getPages() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_pages(HANDLE());
        return PrintPages.fromValue(RESULT);
    }
    
    /**
     * Gets the `GtkPrinter` of the print job.
     */
    public Printer getPrinter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_printer(HANDLE());
        return new Printer(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets whether this job is printed reversed.
     */
    public boolean getReverse() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_reverse(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the job is printed rotated.
     */
    public boolean getRotate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_rotate(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the scale for this job.
     */
    public double getScale() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_scale(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the `GtkPrintSettings` of the print job.
     */
    public PrintSettings getSettings() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_settings(HANDLE());
        return new PrintSettings(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the status of the print job.
     */
    public PrintStatus getStatus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_status(HANDLE());
        return PrintStatus.fromValue(RESULT);
    }
    
    /**
     * Gets a cairo surface onto which the pages of
     * the print job should be rendered.
     */
    public org.cairographics.Surface getSurface() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_surface(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.cairographics.Surface(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the job title.
     */
    public java.lang.String getTitle() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_title(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether jobs will be tracked after printing.
     * 
     * For details, see [method@Gtk.PrintJob.set_track_print_status].
     */
    public boolean getTrackPrintStatus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_get_track_print_status(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether this job is printed collated.
     */
    public void setCollate(boolean collate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_collate(HANDLE(), collate ? 1 : 0);
    }
    
    /**
     * Sets the n-up setting for this job.
     */
    public void setNUp(int nUp) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_n_up(HANDLE(), nUp);
    }
    
    /**
     * Sets the n-up layout setting for this job.
     */
    public void setNUpLayout(NumberUpLayout layout) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_n_up_layout(HANDLE(), layout.getValue());
    }
    
    /**
     * Sets the number of copies for this job.
     */
    public void setNumCopies(int numCopies) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_num_copies(HANDLE(), numCopies);
    }
    
    /**
     * Sets the page ranges for this job.
     */
    public void setPageRanges(PageRange[] ranges, int nRanges) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_page_ranges(HANDLE(), Interop.allocateNativeArray(ranges), nRanges);
    }
    
    /**
     * Sets the `GtkPageSet` setting for this job.
     */
    public void setPageSet(PageSet pageSet) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_page_set(HANDLE(), pageSet.getValue());
    }
    
    /**
     * Sets the `GtkPrintPages` setting for this job.
     */
    public void setPages(PrintPages pages) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_pages(HANDLE(), pages.getValue());
    }
    
    /**
     * Sets whether this job is printed reversed.
     */
    public void setReverse(boolean reverse) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_reverse(HANDLE(), reverse ? 1 : 0);
    }
    
    /**
     * Sets whether this job is printed rotated.
     */
    public void setRotate(boolean rotate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_rotate(HANDLE(), rotate ? 1 : 0);
    }
    
    /**
     * Sets the scale for this job.
     * 
     * 1.0 means unscaled.
     */
    public void setScale(double scale) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_scale(HANDLE(), scale);
    }
    
    /**
     * Make the `GtkPrintJob` send an existing document to the
     * printing system.
     * 
     * The file can be in any format understood by the platforms
     * printing system (typically PostScript, but on many platforms
     * PDF may work too). See [method@Gtk.Printer.accepts_pdf] and
     * [method@Gtk.Printer.accepts_ps].
     * 
     * This is similar to [method@Gtk.PrintJob.set_source_file],
     * but takes expects an open file descriptor for the file,
     * instead of a filename.
     */
    public boolean setSourceFd(int fd) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_source_fd(HANDLE(), fd, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Make the `GtkPrintJob` send an existing document to the
     * printing system.
     * 
     * The file can be in any format understood by the platforms
     * printing system (typically PostScript, but on many platforms
     * PDF may work too). See [method@Gtk.Printer.accepts_pdf] and
     * [method@Gtk.Printer.accepts_ps].
     */
    public boolean setSourceFile(java.lang.String filename) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_source_file(HANDLE(), Interop.getAllocator().allocateUtf8String(filename), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * If track_status is %TRUE, the print job will try to continue report
     * on the status of the print job in the printer queues and printer.
     * 
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     * 
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     */
    public void setTrackPrintStatus(boolean trackStatus) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_print_job_set_track_print_status(HANDLE(), trackStatus ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface StatusChangedHandler {
        void signalReceived(PrintJob source);
    }
    
    /**
     * Emitted when the status of a job changes.
     * 
     * The signal handler can use [method@Gtk.PrintJob.get_status]
     * to obtain the new status.
     */
    public void onStatusChanged(StatusChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPrintJobStatusChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("status-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
