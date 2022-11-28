package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkPrinter} object represents a printer.
 * <p>
 * You only need to deal directly with printers if you use the
 * non-portable {@link PrintUnixDialog} API.
 * <p>
 * A {@code GtkPrinter} allows to get status information about the printer,
 * such as its description, its location, the number of queued jobs,
 * etc. Most importantly, a {@code GtkPrinter} object can be used to create
 * a {@link PrintJob} object, which lets you print to the printer.
 */
public class Printer extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrinter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Printer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Printer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Printer if its GType is a (or inherits from) "GtkPrinter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Printer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPrinter", a ClassCastException will be thrown.
     */
    public static Printer castFrom(org.gtk.gobject.Object gobject) {
            return new Printer(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, @NotNull org.gtk.gtk.PrintBackend backend, boolean virtual) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(backend, "Parameter 'backend' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_new.invokeExact(
                    Interop.allocateNativeString(name),
                    backend.handle(),
                    virtual ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPrinter}.
     * @param name the name of the printer
     * @param backend a {@code GtkPrintBackend}
     * @param virtual whether the printer is virtual
     */
    public Printer(@NotNull java.lang.String name, @NotNull org.gtk.gtk.PrintBackend backend, boolean virtual) {
        super(constructNew(name, backend, virtual), Ownership.FULL);
    }
    
    /**
     * Returns whether the printer accepts input in
     * PDF format.
     * @return {@code true} if {@code printer} accepts PDF
     */
    public boolean acceptsPdf() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_accepts_pdf.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the printer accepts input in
     * PostScript format.
     * @return {@code true} if {@code printer} accepts PostScript
     */
    public boolean acceptsPs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_accepts_ps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Compares two printers.
     * @param b another {@code GtkPrinter}
     * @return 0 if the printer match, a negative value if {@code a} &lt; {@code b},
     *   or a positive value if {@code a} &gt; {@code b}
     */
    public int compare(@NotNull org.gtk.gtk.Printer b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_compare.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the backend of the printer.
     * @return the backend of {@code printer}
     */
    public @NotNull org.gtk.gtk.PrintBackend getBackend() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_backend.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintBackend(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the printer’s capabilities.
     * <p>
     * This is useful when you’re using {@code GtkPrintUnixDialog}’s
     * manual-capabilities setting and need to know which settings
     * the printer can handle and which you must handle yourself.
     * <p>
     * This will return 0 unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     * @return the printer’s capabilities
     */
    public @NotNull org.gtk.gtk.PrintCapabilities getCapabilities() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_get_capabilities.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PrintCapabilities(RESULT);
    }
    
    /**
     * Returns default page size of {@code printer}.
     * @return a newly allocated {@code GtkPageSetup} with default page size
     *   of the printer.
     */
    public @NotNull org.gtk.gtk.PageSetup getDefaultPageSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_default_page_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PageSetup(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the description of the printer.
     * @return the description of {@code printer}
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieve the hard margins of {@code printer}.
     * <p>
     * These are the margins that define the area at the borders
     * of the paper that the printer cannot print to.
     * <p>
     * Note: This will not succeed unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     * @param top a location to store the top margin in
     * @param bottom a location to store the bottom margin in
     * @param left a location to store the left margin in
     * @param right a location to store the right margin in
     * @return {@code true} iff the hard margins were retrieved
     */
    public boolean getHardMargins(Out<Double> top, Out<Double> bottom, Out<Double> left, Out<Double> right) {
        java.util.Objects.requireNonNull(top, "Parameter 'top' must not be null");
        MemorySegment topPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(bottom, "Parameter 'bottom' must not be null");
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(left, "Parameter 'left' must not be null");
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(right, "Parameter 'right' must not be null");
        MemorySegment rightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_get_hard_margins.invokeExact(
                    handle(),
                    (Addressable) topPOINTER.address(),
                    (Addressable) bottomPOINTER.address(),
                    (Addressable) leftPOINTER.address(),
                    (Addressable) rightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        top.set(topPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        bottom.set(bottomPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        left.set(leftPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        right.set(rightPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Retrieve the hard margins of {@code printer} for {@code paper_size}.
     * <p>
     * These are the margins that define the area at the borders
     * of the paper that the printer cannot print to.
     * <p>
     * Note: This will not succeed unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     * @param paperSize a {@code GtkPaperSize}
     * @param top a location to store the top margin in
     * @param bottom a location to store the bottom margin in
     * @param left a location to store the left margin in
     * @param right a location to store the right margin in
     * @return {@code true} iff the hard margins were retrieved
     */
    public boolean getHardMarginsForPaperSize(@NotNull org.gtk.gtk.PaperSize paperSize, Out<Double> top, Out<Double> bottom, Out<Double> left, Out<Double> right) {
        java.util.Objects.requireNonNull(paperSize, "Parameter 'paperSize' must not be null");
        java.util.Objects.requireNonNull(top, "Parameter 'top' must not be null");
        MemorySegment topPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(bottom, "Parameter 'bottom' must not be null");
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(left, "Parameter 'left' must not be null");
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(right, "Parameter 'right' must not be null");
        MemorySegment rightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_get_hard_margins_for_paper_size.invokeExact(
                    handle(),
                    paperSize.handle(),
                    (Addressable) topPOINTER.address(),
                    (Addressable) bottomPOINTER.address(),
                    (Addressable) leftPOINTER.address(),
                    (Addressable) rightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        top.set(topPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        bottom.set(bottomPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        left.set(leftPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        right.set(rightPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the name of the icon to use for the printer.
     * @return the icon name for {@code printer}
     */
    public @NotNull java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the number of jobs currently queued on the printer.
     * @return the number of jobs on {@code printer}
     */
    public int getJobCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_get_job_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a description of the location of the printer.
     * @return the location of {@code printer}
     */
    public @NotNull java.lang.String getLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_location.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the name of the printer.
     * @return the name of {@code printer}
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the state message describing the current state
     * of the printer.
     * @return the state message of {@code printer}
     */
    public @NotNull java.lang.String getStateMessage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_state_message.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether the printer details are available.
     * @return {@code true} if {@code printer} details are available
     */
    public boolean hasDetails() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_has_details.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the printer is accepting jobs
     * @return {@code true} if {@code printer} is accepting jobs
     */
    public boolean isAcceptingJobs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_is_accepting_jobs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the printer is currently active (i.e.
     * accepts new jobs).
     * @return {@code true} if {@code printer} is active
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_is_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the printer is the default printer.
     * @return {@code true} if {@code printer} is the default
     */
    public boolean isDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_is_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the printer is currently paused.
     * <p>
     * A paused printer still accepts jobs, but it is not
     * printing them.
     * @return {@code true} if {@code printer} is paused
     */
    public boolean isPaused() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_is_paused.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the printer is virtual (i.e. does not
     * represent actual printer hardware, but something like
     * a CUPS class).
     * @return {@code true} if {@code printer} is virtual
     */
    public boolean isVirtual() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_printer_is_virtual.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Lists all the paper sizes {@code printer} supports.
     * <p>
     * This will return and empty list unless the printer’s details
     * are available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     * @return a newly
     *   allocated list of newly allocated {@code GtkPageSetup}s.
     */
    public @NotNull org.gtk.glib.List listPapers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_list_papers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Requests the printer details.
     * <p>
     * When the details are available, the
     * {@code Gtk.Printer::details-acquired} signal
     * will be emitted on {@code printer}.
     */
    public void requestDetails() {
        try {
            DowncallHandles.gtk_printer_request_details.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gtk_printer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface DetailsAcquired {
        void signalReceived(Printer source, boolean success);
    }
    
    /**
     * Emitted in response to a request for detailed information
     * about a printer from the print backend.
     * <p>
     * The {@code success} parameter indicates if the information was
     * actually obtained.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Printer.DetailsAcquired> onDetailsAcquired(Printer.DetailsAcquired handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("details-acquired"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Printer.Callbacks.class, "signalPrinterDetailsAcquired",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Printer.DetailsAcquired>(handle(), RESULT);
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
         * A {@link Printer.Build} object constructs a {@link Printer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Printer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Printer} using {@link Printer#castFrom}.
         * @return A new instance of {@code Printer} with the properties 
         *         that were set in the Build object.
         */
        public Printer construct() {
            return Printer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Printer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * {@code true} if the printer is accepting jobs.
         * @param acceptingJobs The value for the {@code accepting-jobs} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAcceptingJobs(boolean acceptingJobs) {
            names.add("accepting-jobs");
            values.add(org.gtk.gobject.Value.create(acceptingJobs));
            return this;
        }
        
        /**
         * {@code true} if this printer can accept PDF.
         * @param acceptsPdf The value for the {@code accepts-pdf} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAcceptsPdf(boolean acceptsPdf) {
            names.add("accepts-pdf");
            values.add(org.gtk.gobject.Value.create(acceptsPdf));
            return this;
        }
        
        /**
         * {@code true} if this printer can accept PostScript.
         * @param acceptsPs The value for the {@code accepts-ps} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAcceptsPs(boolean acceptsPs) {
            names.add("accepts-ps");
            values.add(org.gtk.gobject.Value.create(acceptsPs));
            return this;
        }
        
        /**
         * The backend for the printer.
         * @param backend The value for the {@code backend} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBackend(java.lang.foreign.MemoryAddress backend) {
            names.add("backend");
            values.add(org.gtk.gobject.Value.create(backend));
            return this;
        }
        
        /**
         * Icon name to use for the printer.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * {@code false} if this represents a real hardware device.
         * @param isVirtual The value for the {@code is-virtual} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsVirtual(boolean isVirtual) {
            names.add("is-virtual");
            values.add(org.gtk.gobject.Value.create(isVirtual));
            return this;
        }
        
        /**
         * Number of jobs queued in the printer.
         * @param jobCount The value for the {@code job-count} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setJobCount(int jobCount) {
            names.add("job-count");
            values.add(org.gtk.gobject.Value.create(jobCount));
            return this;
        }
        
        /**
         * Information about the location of the printer.
         * @param location The value for the {@code location} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLocation(java.lang.String location) {
            names.add("location");
            values.add(org.gtk.gobject.Value.create(location));
            return this;
        }
        
        /**
         * The name of the printer.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * {@code true} if this printer is paused.
         * <p>
         * A paused printer still accepts jobs, but it does
         * not print them.
         * @param paused The value for the {@code paused} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPaused(boolean paused) {
            names.add("paused");
            values.add(org.gtk.gobject.Value.create(paused));
            return this;
        }
        
        /**
         * String giving the current status of the printer.
         * @param stateMessage The value for the {@code state-message} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStateMessage(java.lang.String stateMessage) {
            names.add("state-message");
            values.add(org.gtk.gobject.Value.create(stateMessage));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_printer_new = Interop.downcallHandle(
            "gtk_printer_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_printer_accepts_pdf = Interop.downcallHandle(
            "gtk_printer_accepts_pdf",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_accepts_ps = Interop.downcallHandle(
            "gtk_printer_accepts_ps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_compare = Interop.downcallHandle(
            "gtk_printer_compare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_backend = Interop.downcallHandle(
            "gtk_printer_get_backend",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_capabilities = Interop.downcallHandle(
            "gtk_printer_get_capabilities",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_default_page_size = Interop.downcallHandle(
            "gtk_printer_get_default_page_size",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_description = Interop.downcallHandle(
            "gtk_printer_get_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_hard_margins = Interop.downcallHandle(
            "gtk_printer_get_hard_margins",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_hard_margins_for_paper_size = Interop.downcallHandle(
            "gtk_printer_get_hard_margins_for_paper_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_icon_name = Interop.downcallHandle(
            "gtk_printer_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_job_count = Interop.downcallHandle(
            "gtk_printer_get_job_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_location = Interop.downcallHandle(
            "gtk_printer_get_location",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_name = Interop.downcallHandle(
            "gtk_printer_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_state_message = Interop.downcallHandle(
            "gtk_printer_get_state_message",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_has_details = Interop.downcallHandle(
            "gtk_printer_has_details",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_is_accepting_jobs = Interop.downcallHandle(
            "gtk_printer_is_accepting_jobs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_is_active = Interop.downcallHandle(
            "gtk_printer_is_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_is_default = Interop.downcallHandle(
            "gtk_printer_is_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_is_paused = Interop.downcallHandle(
            "gtk_printer_is_paused",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_is_virtual = Interop.downcallHandle(
            "gtk_printer_is_virtual",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_list_papers = Interop.downcallHandle(
            "gtk_printer_list_papers",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_request_details = Interop.downcallHandle(
            "gtk_printer_request_details",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_printer_get_type = Interop.downcallHandle(
            "gtk_printer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalPrinterDetailsAcquired(MemoryAddress source, int success, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Printer.DetailsAcquired) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Printer(source, Ownership.NONE), success != 0);
        }
    }
}
