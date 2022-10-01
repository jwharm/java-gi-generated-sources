package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkPrintJob} object represents a job that is sent to a printer.
 * <p>
 * You only need to deal directly with print jobs if you use the
 * non-portable {@link PrintUnixDialog} API.
 * <p>
 * Use {@link PrintJob#getSurface} to obtain the cairo surface
 * onto which the pages must be drawn. Use {@link PrintJob#send}
 * to send the finished job to the printer. If you don’t use cairo
 * {@code GtkPrintJob} also supports printing of manually generated PostScript,
 * via {@link PrintJob#setSourceFile}.
 */
public class PrintJob extends org.gtk.gobject.Object {

    public PrintJob(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PrintJob */
    public static PrintJob castFrom(org.gtk.gobject.Object gobject) {
        return new PrintJob(gobject.refcounted());
    }
    
    private static Refcounted constructNew(java.lang.String title, Printer printer, PrintSettings settings, PageSetup pageSetup) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_print_job_new(Interop.allocateNativeString(title).handle(), printer.handle(), settings.handle(), pageSetup.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrintJob}.
     */
    public PrintJob(java.lang.String title, Printer printer, PrintSettings settings, PageSetup pageSetup) {
        super(constructNew(title, printer, settings, pageSetup));
    }
    
    /**
     * Gets whether this job is printed collated.
     */
    public boolean getCollate() {
        var RESULT = gtk_h.gtk_print_job_get_collate(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the n-up setting for this job.
     */
    public int getNUp() {
        var RESULT = gtk_h.gtk_print_job_get_n_up(handle());
        return RESULT;
    }
    
    /**
     * Gets the n-up layout setting for this job.
     */
    public NumberUpLayout getNUpLayout() {
        var RESULT = gtk_h.gtk_print_job_get_n_up_layout(handle());
        return new NumberUpLayout(RESULT);
    }
    
    /**
     * Gets the number of copies of this job.
     */
    public int getNumCopies() {
        var RESULT = gtk_h.gtk_print_job_get_num_copies(handle());
        return RESULT;
    }
    
    /**
     * Gets the page ranges for this job.
     */
    public PointerIterator<PageRange> getPageRanges(PointerInteger nRanges) {
        var RESULT = gtk_h.gtk_print_job_get_page_ranges(handle(), nRanges.handle());
        return new PointerProxy<PageRange>(RESULT, PageRange.class).iterator();
    }
    
    /**
     * Gets the {@code GtkPageSet} setting for this job.
     */
    public PageSet getPageSet() {
        var RESULT = gtk_h.gtk_print_job_get_page_set(handle());
        return new PageSet(RESULT);
    }
    
    /**
     * Gets the {@code GtkPrintPages} setting for this job.
     */
    public PrintPages getPages() {
        var RESULT = gtk_h.gtk_print_job_get_pages(handle());
        return new PrintPages(RESULT);
    }
    
    /**
     * Gets the {@code GtkPrinter} of the print job.
     */
    public Printer getPrinter() {
        var RESULT = gtk_h.gtk_print_job_get_printer(handle());
        return new Printer(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether this job is printed reversed.
     */
    public boolean getReverse() {
        var RESULT = gtk_h.gtk_print_job_get_reverse(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether the job is printed rotated.
     */
    public boolean getRotate() {
        var RESULT = gtk_h.gtk_print_job_get_rotate(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the scale for this job.
     */
    public double getScale() {
        var RESULT = gtk_h.gtk_print_job_get_scale(handle());
        return RESULT;
    }
    
    /**
     * Gets the {@code GtkPrintSettings} of the print job.
     */
    public PrintSettings getSettings() {
        var RESULT = gtk_h.gtk_print_job_get_settings(handle());
        return new PrintSettings(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the status of the print job.
     */
    public PrintStatus getStatus() {
        var RESULT = gtk_h.gtk_print_job_get_status(handle());
        return new PrintStatus(RESULT);
    }
    
    /**
     * Gets a cairo surface onto which the pages of
     * the print job should be rendered.
     */
    public org.cairographics.Surface getSurface() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_print_job_get_surface(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.cairographics.Surface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the job title.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.gtk_print_job_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether jobs will be tracked after printing.
     * <p>
     * For details, see {@link PrintJob#setTrackPrintStatus}.
     */
    public boolean getTrackPrintStatus() {
        var RESULT = gtk_h.gtk_print_job_get_track_print_status(handle());
        return RESULT != 0;
    }
    
    /**
     * Sends the print job off to the printer.
     */
    public void send(PrintJobCompleteFunc callback) {
        try {
            gtk_h.gtk_print_job_send(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbPrintJobCompleteFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets whether this job is printed collated.
     */
    public void setCollate(boolean collate) {
        gtk_h.gtk_print_job_set_collate(handle(), collate ? 1 : 0);
    }
    
    /**
     * Sets the n-up setting for this job.
     */
    public void setNUp(int nUp) {
        gtk_h.gtk_print_job_set_n_up(handle(), nUp);
    }
    
    /**
     * Sets the n-up layout setting for this job.
     */
    public void setNUpLayout(NumberUpLayout layout) {
        gtk_h.gtk_print_job_set_n_up_layout(handle(), layout.getValue());
    }
    
    /**
     * Sets the number of copies for this job.
     */
    public void setNumCopies(int numCopies) {
        gtk_h.gtk_print_job_set_num_copies(handle(), numCopies);
    }
    
    /**
     * Sets the page ranges for this job.
     */
    public void setPageRanges(PageRange[] ranges, int nRanges) {
        gtk_h.gtk_print_job_set_page_ranges(handle(), Interop.allocateNativeArray(ranges).handle(), nRanges);
    }
    
    /**
     * Sets the {@code GtkPageSet} setting for this job.
     */
    public void setPageSet(PageSet pageSet) {
        gtk_h.gtk_print_job_set_page_set(handle(), pageSet.getValue());
    }
    
    /**
     * Sets the {@code GtkPrintPages} setting for this job.
     */
    public void setPages(PrintPages pages) {
        gtk_h.gtk_print_job_set_pages(handle(), pages.getValue());
    }
    
    /**
     * Sets whether this job is printed reversed.
     */
    public void setReverse(boolean reverse) {
        gtk_h.gtk_print_job_set_reverse(handle(), reverse ? 1 : 0);
    }
    
    /**
     * Sets whether this job is printed rotated.
     */
    public void setRotate(boolean rotate) {
        gtk_h.gtk_print_job_set_rotate(handle(), rotate ? 1 : 0);
    }
    
    /**
     * Sets the scale for this job.
     * <p>
     * 1.0 means unscaled.
     */
    public void setScale(double scale) {
        gtk_h.gtk_print_job_set_scale(handle(), scale);
    }
    
    /**
     * Make the {@code GtkPrintJob} send an existing document to the
     * printing system.
     * <p>
     * The file can be in any format understood by the platforms
     * printing system (typically PostScript, but on many platforms
     * PDF may work too). See {@link Printer#acceptsPdf} and
     * {@link Printer#acceptsPs}.
     * <p>
     * This is similar to {@link PrintJob#setSourceFile},
     * but takes expects an open file descriptor for the file,
     * instead of a filename.
     */
    public boolean setSourceFd(int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_print_job_set_source_fd(handle(), fd, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Make the {@code GtkPrintJob} send an existing document to the
     * printing system.
     * <p>
     * The file can be in any format understood by the platforms
     * printing system (typically PostScript, but on many platforms
     * PDF may work too). See {@link Printer#acceptsPdf} and
     * {@link Printer#acceptsPs}.
     */
    public boolean setSourceFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_print_job_set_source_file(handle(), Interop.allocateNativeString(filename).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * If track_status is {@code true}, the print job will try to continue report
     * on the status of the print job in the printer queues and printer.
     * <p>
     * This can allow your application to show things like “out of paper”
     * issues, and when the print job actually reaches the printer.
     * <p>
     * This function is often implemented using some form of polling,
     * so it should not be enabled unless needed.
     */
    public void setTrackPrintStatus(boolean trackStatus) {
        gtk_h.gtk_print_job_set_track_print_status(handle(), trackStatus ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface StatusChangedHandler {
        void signalReceived(PrintJob source);
    }
    
    /**
     * Emitted when the status of a job changes.
     * <p>
     * The signal handler can use {@link PrintJob#getStatus}
     * to obtain the new status.
     */
    public SignalHandle onStatusChanged(StatusChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("status-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintJob.Callbacks.class, "signalPrintJobStatusChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalPrintJobStatusChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PrintJob.StatusChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PrintJob(Refcounted.get(source)));
        }
        
    }
}
