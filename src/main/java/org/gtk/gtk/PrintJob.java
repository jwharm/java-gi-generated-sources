package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintJob";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PrintJob proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PrintJob(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PrintJob if its GType is a (or inherits from) "GtkPrintJob".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PrintJob} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPrintJob", a ClassCastException will be thrown.
     */
    public static PrintJob castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), PrintJob.getType())) {
            return new PrintJob(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPrintJob");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String title, @NotNull org.gtk.gtk.Printer printer, @NotNull org.gtk.gtk.PrintSettings settings, @NotNull org.gtk.gtk.PageSetup pageSetup) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        java.util.Objects.requireNonNull(printer, "Parameter 'printer' must not be null");
        java.util.Objects.requireNonNull(settings, "Parameter 'settings' must not be null");
        java.util.Objects.requireNonNull(pageSetup, "Parameter 'pageSetup' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_new.invokeExact(
                    Interop.allocateNativeString(title),
                    printer.handle(),
                    settings.handle(),
                    pageSetup.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrintJob}.
     * @param title the job title
     * @param printer a {@code GtkPrinter}
     * @param settings a {@code GtkPrintSettings}
     * @param pageSetup a {@code GtkPageSetup}
     */
    public PrintJob(@NotNull java.lang.String title, @NotNull org.gtk.gtk.Printer printer, @NotNull org.gtk.gtk.PrintSettings settings, @NotNull org.gtk.gtk.PageSetup pageSetup) {
        super(constructNew(title, printer, settings, pageSetup), Ownership.FULL);
    }
    
    /**
     * Gets whether this job is printed collated.
     * @return whether the job is printed collated
     */
    public boolean getCollate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_collate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the n-up setting for this job.
     * @return the n-up setting
     */
    public int getNUp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_n_up.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the n-up layout setting for this job.
     * @return the n-up layout
     */
    public @NotNull org.gtk.gtk.NumberUpLayout getNUpLayout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_n_up_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.NumberUpLayout(RESULT);
    }
    
    /**
     * Gets the number of copies of this job.
     * @return the number of copies
     */
    public int getNumCopies() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_num_copies.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the page ranges for this job.
     * @param nRanges return location for the number of ranges
     * @return a pointer to an
     *   array of {@code GtkPageRange} structs
     */
    public @NotNull org.gtk.gtk.PageRange[] getPageRanges(Out<Integer> nRanges) {
        java.util.Objects.requireNonNull(nRanges, "Parameter 'nRanges' must not be null");
        MemorySegment nRangesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_page_ranges.invokeExact(
                    handle(),
                    (Addressable) nRangesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nRanges.set(nRangesPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.gtk.PageRange[] resultARRAY = new org.gtk.gtk.PageRange[nRanges.get().intValue()];
        for (int I = 0; I < nRanges.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gtk.PageRange(OBJ, Ownership.NONE);
        }
        return resultARRAY;
    }
    
    /**
     * Gets the {@code GtkPageSet} setting for this job.
     * @return the {@code GtkPageSet} setting
     */
    public @NotNull org.gtk.gtk.PageSet getPageSet() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_page_set.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSet(RESULT);
    }
    
    /**
     * Gets the {@code GtkPrintPages} setting for this job.
     * @return the {@code GtkPrintPages} setting
     */
    public @NotNull org.gtk.gtk.PrintPages getPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintPages(RESULT);
    }
    
    /**
     * Gets the {@code GtkPrinter} of the print job.
     * @return the printer of {@code job}
     */
    public @NotNull org.gtk.gtk.Printer getPrinter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_printer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Printer(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether this job is printed reversed.
     * @return whether the job is printed reversed.
     */
    public boolean getReverse() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_reverse.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether the job is printed rotated.
     * @return whether the job is printed rotated
     */
    public boolean getRotate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_rotate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the scale for this job.
     * @return the scale
     */
    public double getScale() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_job_get_scale.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code GtkPrintSettings} of the print job.
     * @return the settings of {@code job}
     */
    public @NotNull org.gtk.gtk.PrintSettings getSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_settings.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintSettings(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the status of the print job.
     * @return the status of {@code job}
     */
    public @NotNull org.gtk.gtk.PrintStatus getStatus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_status.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintStatus(RESULT);
    }
    
    /**
     * Gets a cairo surface onto which the pages of
     * the print job should be rendered.
     * @return the cairo surface of {@code job}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.cairographics.Surface getSurface() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_surface.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.cairographics.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the job title.
     * @return the title of {@code job}
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether jobs will be tracked after printing.
     * <p>
     * For details, see {@link PrintJob#setTrackPrintStatus}.
     * @return {@code true} if print job status will be reported after printing
     */
    public boolean getTrackPrintStatus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_track_print_status.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sends the print job off to the printer.
     * @param callback function to call when the job completes or an error occurs
     */
    public void send(@NotNull org.gtk.gtk.PrintJobCompleteFunc callback) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gtk_print_job_send.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbPrintJobCompleteFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether this job is printed collated.
     * @param collate whether the job is printed collated
     */
    public void setCollate(boolean collate) {
        try {
            DowncallHandles.gtk_print_job_set_collate.invokeExact(
                    handle(),
                    collate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the n-up setting for this job.
     * @param nUp the n-up value
     */
    public void setNUp(int nUp) {
        try {
            DowncallHandles.gtk_print_job_set_n_up.invokeExact(
                    handle(),
                    nUp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the n-up layout setting for this job.
     * @param layout the n-up layout setting
     */
    public void setNUpLayout(@NotNull org.gtk.gtk.NumberUpLayout layout) {
        java.util.Objects.requireNonNull(layout, "Parameter 'layout' must not be null");
        try {
            DowncallHandles.gtk_print_job_set_n_up_layout.invokeExact(
                    handle(),
                    layout.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of copies for this job.
     * @param numCopies the number of copies
     */
    public void setNumCopies(int numCopies) {
        try {
            DowncallHandles.gtk_print_job_set_num_copies.invokeExact(
                    handle(),
                    numCopies);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page ranges for this job.
     * @param ranges pointer to an array of
     *    {@code GtkPageRange} structs
     * @param nRanges the length of the {@code ranges} array
     */
    public void setPageRanges(@NotNull org.gtk.gtk.PageRange[] ranges, int nRanges) {
        java.util.Objects.requireNonNull(ranges, "Parameter 'ranges' must not be null");
        try {
            DowncallHandles.gtk_print_job_set_page_ranges.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(ranges, org.gtk.gtk.PageRange.getMemoryLayout(), false),
                    nRanges);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkPageSet} setting for this job.
     * @param pageSet a {@code GtkPageSet} setting
     */
    public void setPageSet(@NotNull org.gtk.gtk.PageSet pageSet) {
        java.util.Objects.requireNonNull(pageSet, "Parameter 'pageSet' must not be null");
        try {
            DowncallHandles.gtk_print_job_set_page_set.invokeExact(
                    handle(),
                    pageSet.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkPrintPages} setting for this job.
     * @param pages the {@code GtkPrintPages} setting
     */
    public void setPages(@NotNull org.gtk.gtk.PrintPages pages) {
        java.util.Objects.requireNonNull(pages, "Parameter 'pages' must not be null");
        try {
            DowncallHandles.gtk_print_job_set_pages.invokeExact(
                    handle(),
                    pages.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether this job is printed reversed.
     * @param reverse whether the job is printed reversed
     */
    public void setReverse(boolean reverse) {
        try {
            DowncallHandles.gtk_print_job_set_reverse.invokeExact(
                    handle(),
                    reverse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether this job is printed rotated.
     * @param rotate whether to print rotated
     */
    public void setRotate(boolean rotate) {
        try {
            DowncallHandles.gtk_print_job_set_rotate.invokeExact(
                    handle(),
                    rotate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the scale for this job.
     * <p>
     * 1.0 means unscaled.
     * @param scale the scale
     */
    public void setScale(double scale) {
        try {
            DowncallHandles.gtk_print_job_set_scale.invokeExact(
                    handle(),
                    scale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param fd a file descriptor
     * @return {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setSourceFd(int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_set_source_fd.invokeExact(
                    handle(),
                    fd,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param filename the file to be printed
     * @return {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setSourceFile(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_set_source_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param trackStatus {@code true} to track status after printing
     */
    public void setTrackPrintStatus(boolean trackStatus) {
        try {
            DowncallHandles.gtk_print_job_set_track_print_status.invokeExact(
                    handle(),
                    trackStatus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_print_job_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface StatusChanged {
        void signalReceived(PrintJob source);
    }
    
    /**
     * Emitted when the status of a job changes.
     * <p>
     * The signal handler can use {@link PrintJob#getStatus}
     * to obtain the new status.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PrintJob.StatusChanged> onStatusChanged(PrintJob.StatusChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("status-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PrintJob.Callbacks.class, "signalPrintJobStatusChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PrintJob.StatusChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link PrintJob.Build} object constructs a {@link PrintJob} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PrintJob} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PrintJob} using {@link PrintJob#castFrom}.
         * @return A new instance of {@code PrintJob} with the properties 
         *         that were set in the Build object.
         */
        public PrintJob construct() {
            return PrintJob.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PrintJob.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Page setup.
         * @param pageSetup The value for the {@code page-setup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPageSetup(org.gtk.gtk.PageSetup pageSetup) {
            names.add("page-setup");
            values.add(org.gtk.gobject.Value.create(pageSetup));
            return this;
        }
        
        /**
         * The printer to send the job to.
         * @param printer The value for the {@code printer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrinter(org.gtk.gtk.Printer printer) {
            names.add("printer");
            values.add(org.gtk.gobject.Value.create(printer));
            return this;
        }
        
        /**
         * Printer settings.
         * @param settings The value for the {@code settings} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSettings(org.gtk.gtk.PrintSettings settings) {
            names.add("settings");
            values.add(org.gtk.gobject.Value.create(settings));
            return this;
        }
        
        /**
         * The title of the print job.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * {@code true} if the print job will continue to emit status-changed
         * signals after the print data has been setn to the printer.
         * @param trackPrintStatus The value for the {@code track-print-status} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTrackPrintStatus(boolean trackPrintStatus) {
            names.add("track-print-status");
            values.add(org.gtk.gobject.Value.create(trackPrintStatus));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_print_job_new = Interop.downcallHandle(
            "gtk_print_job_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_collate = Interop.downcallHandle(
            "gtk_print_job_get_collate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_n_up = Interop.downcallHandle(
            "gtk_print_job_get_n_up",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_n_up_layout = Interop.downcallHandle(
            "gtk_print_job_get_n_up_layout",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_num_copies = Interop.downcallHandle(
            "gtk_print_job_get_num_copies",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_page_ranges = Interop.downcallHandle(
            "gtk_print_job_get_page_ranges",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_page_set = Interop.downcallHandle(
            "gtk_print_job_get_page_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_pages = Interop.downcallHandle(
            "gtk_print_job_get_pages",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_printer = Interop.downcallHandle(
            "gtk_print_job_get_printer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_reverse = Interop.downcallHandle(
            "gtk_print_job_get_reverse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_rotate = Interop.downcallHandle(
            "gtk_print_job_get_rotate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_scale = Interop.downcallHandle(
            "gtk_print_job_get_scale",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_settings = Interop.downcallHandle(
            "gtk_print_job_get_settings",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_status = Interop.downcallHandle(
            "gtk_print_job_get_status",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_surface = Interop.downcallHandle(
            "gtk_print_job_get_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_title = Interop.downcallHandle(
            "gtk_print_job_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_track_print_status = Interop.downcallHandle(
            "gtk_print_job_get_track_print_status",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_send = Interop.downcallHandle(
            "gtk_print_job_send",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_collate = Interop.downcallHandle(
            "gtk_print_job_set_collate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_n_up = Interop.downcallHandle(
            "gtk_print_job_set_n_up",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_n_up_layout = Interop.downcallHandle(
            "gtk_print_job_set_n_up_layout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_num_copies = Interop.downcallHandle(
            "gtk_print_job_set_num_copies",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_page_ranges = Interop.downcallHandle(
            "gtk_print_job_set_page_ranges",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_page_set = Interop.downcallHandle(
            "gtk_print_job_set_page_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_pages = Interop.downcallHandle(
            "gtk_print_job_set_pages",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_reverse = Interop.downcallHandle(
            "gtk_print_job_set_reverse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_rotate = Interop.downcallHandle(
            "gtk_print_job_set_rotate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_scale = Interop.downcallHandle(
            "gtk_print_job_set_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_source_fd = Interop.downcallHandle(
            "gtk_print_job_set_source_fd",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_source_file = Interop.downcallHandle(
            "gtk_print_job_set_source_file",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_print_job_set_track_print_status = Interop.downcallHandle(
            "gtk_print_job_set_track_print_status",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_print_job_get_type = Interop.downcallHandle(
            "gtk_print_job_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalPrintJobStatusChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PrintJob.StatusChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PrintJob(source, Ownership.NONE));
        }
    }
}
