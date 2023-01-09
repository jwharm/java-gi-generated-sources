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
public class PrintJob extends org.gtk.gobject.GObject {
    
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
     */
    protected PrintJob(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PrintJob> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PrintJob(input);
    
    private static MemoryAddress constructNew(java.lang.String title, org.gtk.gtk.Printer printer, org.gtk.gtk.PrintSettings settings, org.gtk.gtk.PageSetup pageSetup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_new.invokeExact(
                        Marshal.stringToAddress.marshal(title, SCOPE),
                        printer.handle(),
                        settings.handle(),
                        pageSetup.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@code GtkPrintJob}.
     * @param title the job title
     * @param printer a {@code GtkPrinter}
     * @param settings a {@code GtkPrintSettings}
     * @param pageSetup a {@code GtkPageSetup}
     */
    public PrintJob(java.lang.String title, org.gtk.gtk.Printer printer, org.gtk.gtk.PrintSettings settings, org.gtk.gtk.PageSetup pageSetup) {
        super(constructNew(title, printer, settings, pageSetup));
        this.takeOwnership();
    }
    
    /**
     * Gets whether this job is printed collated.
     * @return whether the job is printed collated
     */
    public boolean getCollate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_collate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the n-up setting for this job.
     * @return the n-up setting
     */
    public int getNUp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_n_up.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the n-up layout setting for this job.
     * @return the n-up layout
     */
    public org.gtk.gtk.NumberUpLayout getNUpLayout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_n_up_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.NumberUpLayout.of(RESULT);
    }
    
    /**
     * Gets the number of copies of this job.
     * @return the number of copies
     */
    public int getNumCopies() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_num_copies.invokeExact(handle());
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
    public org.gtk.gtk.PageRange[] getPageRanges(Out<Integer> nRanges) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nRangesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
                resultARRAY[I] = org.gtk.gtk.PageRange.fromAddress.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Gets the {@code GtkPageSet} setting for this job.
     * @return the {@code GtkPageSet} setting
     */
    public org.gtk.gtk.PageSet getPageSet() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_page_set.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PageSet.of(RESULT);
    }
    
    /**
     * Gets the {@code GtkPrintPages} setting for this job.
     * @return the {@code GtkPrintPages} setting
     */
    public org.gtk.gtk.PrintPages getPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PrintPages.of(RESULT);
    }
    
    /**
     * Gets the {@code GtkPrinter} of the print job.
     * @return the printer of {@code job}
     */
    public org.gtk.gtk.Printer getPrinter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_printer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Printer) Interop.register(RESULT, org.gtk.gtk.Printer.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether this job is printed reversed.
     * @return whether the job is printed reversed.
     */
    public boolean getReverse() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_reverse.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether the job is printed rotated.
     * @return whether the job is printed rotated
     */
    public boolean getRotate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_rotate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the scale for this job.
     * @return the scale
     */
    public double getScale() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_print_job_get_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code GtkPrintSettings} of the print job.
     * @return the settings of {@code job}
     */
    public org.gtk.gtk.PrintSettings getSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_settings.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.PrintSettings) Interop.register(RESULT, org.gtk.gtk.PrintSettings.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the status of the print job.
     * @return the status of {@code job}
     */
    public org.gtk.gtk.PrintStatus getStatus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_job_get_status.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PrintStatus.of(RESULT);
    }
    
    /**
     * Gets a cairo surface onto which the pages of
     * the print job should be rendered.
     * @return the cairo surface of {@code job}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.cairographics.Surface getSurface() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_surface.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.cairographics.Surface.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the job title.
     * @return the title of {@code job}
     */
    public java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_print_job_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.gtk_print_job_get_track_print_status.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sends the print job off to the printer.
     * @param callback function to call when the job completes or an error occurs
     * @param dnotify destroy notify for {@code user_data}
     */
    public void send(org.gtk.gtk.PrintJobCompleteFunc callback, org.gtk.glib.DestroyNotify dnotify) {
        try {
            DowncallHandles.gtk_print_job_send.invokeExact(
                    handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) dnotify.toCallback());
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
                    Marshal.booleanToInteger.marshal(collate, null).intValue());
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
    public void setNUpLayout(org.gtk.gtk.NumberUpLayout layout) {
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
    public void setPageRanges(org.gtk.gtk.PageRange[] ranges, int nRanges) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_print_job_set_page_ranges.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(ranges, org.gtk.gtk.PageRange.getMemoryLayout(), false, SCOPE),
                        nRanges);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the {@code GtkPageSet} setting for this job.
     * @param pageSet a {@code GtkPageSet} setting
     */
    public void setPageSet(org.gtk.gtk.PageSet pageSet) {
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
    public void setPages(org.gtk.gtk.PrintPages pages) {
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
                    Marshal.booleanToInteger.marshal(reverse, null).intValue());
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
                    Marshal.booleanToInteger.marshal(rotate, null).intValue());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param filename the file to be printed
     * @return {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setSourceFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_print_job_set_source_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(filename, SCOPE),
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
                    Marshal.booleanToInteger.marshal(trackStatus, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_print_job_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code StatusChanged} callback.
     */
    @FunctionalInterface
    public interface StatusChanged {
    
        /**
         * Emitted when the status of a job changes.
         * <p>
         * The signal handler can use {@link PrintJob#getStatus}
         * to obtain the new status.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourcePrintJob) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StatusChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("status-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link PrintJob.Builder} object constructs a {@link PrintJob} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PrintJob.Builder#build()}. 
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
         * Finish building the {@link PrintJob} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PrintJob}.
         * @return A new instance of {@code PrintJob} with the properties 
         *         that were set in the Builder object.
         */
        public PrintJob build() {
            return (PrintJob) org.gtk.gobject.GObject.newWithProperties(
                PrintJob.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Page setup.
         * @param pageSetup The value for the {@code page-setup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPageSetup(org.gtk.gtk.PageSetup pageSetup) {
            names.add("page-setup");
            values.add(org.gtk.gobject.Value.create(pageSetup));
            return this;
        }
        
        /**
         * The printer to send the job to.
         * @param printer The value for the {@code printer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrinter(org.gtk.gtk.Printer printer) {
            names.add("printer");
            values.add(org.gtk.gobject.Value.create(printer));
            return this;
        }
        
        /**
         * Printer settings.
         * @param settings The value for the {@code settings} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSettings(org.gtk.gtk.PrintSettings settings) {
            names.add("settings");
            values.add(org.gtk.gobject.Value.create(settings));
            return this;
        }
        
        /**
         * The title of the print job.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
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
        public Builder setTrackPrintStatus(boolean trackPrintStatus) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_print_job_get_type != null;
    }
}
