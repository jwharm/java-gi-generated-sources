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
public class Printer extends org.gtk.gobject.GObject {
    
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
    protected Printer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Printer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Printer(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String name, org.gtk.gtk.PrintBackend backend, boolean virtual) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_new.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    backend.handle(),
                    Marshal.booleanToInteger.marshal(virtual, null).intValue());
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
    public Printer(java.lang.String name, org.gtk.gtk.PrintBackend backend, boolean virtual) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Compares two printers.
     * @param b another {@code GtkPrinter}
     * @return 0 if the printer match, a negative value if {@code a} &lt; {@code b},
     *   or a positive value if {@code a} &gt; {@code b}
     */
    public int compare(org.gtk.gtk.Printer b) {
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
    public org.gtk.gtk.PrintBackend getBackend() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_backend.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PrintBackend.fromAddress.marshal(RESULT, Ownership.NONE);
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
    public org.gtk.gtk.PrintCapabilities getCapabilities() {
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
    public org.gtk.gtk.PageSetup getDefaultPageSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_default_page_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.PageSetup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PageSetup.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the description of the printer.
     * @return the description of {@code printer}
     */
    public java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        MemorySegment topPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean getHardMarginsForPaperSize(org.gtk.gtk.PaperSize paperSize, Out<Double> top, Out<Double> bottom, Out<Double> left, Out<Double> right) {
        MemorySegment topPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the name of the icon to use for the printer.
     * @return the icon name for {@code printer}
     */
    public java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    public java.lang.String getLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_location.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the name of the printer.
     * @return the name of {@code printer}
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the state message describing the current state
     * of the printer.
     * @return the state message of {@code printer}
     */
    public java.lang.String getStateMessage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_get_state_message.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public org.gtk.glib.List listPapers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_printer_list_papers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public static org.gtk.glib.Type getType() {
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
        void run(boolean success);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePrinter, int success) {
            run(Marshal.integerToBoolean.marshal(success, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DetailsAcquired.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("details-acquired"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Printer.Builder} object constructs a {@link Printer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Printer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Printer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Printer}.
         * @return A new instance of {@code Printer} with the properties 
         *         that were set in the Builder object.
         */
        public Printer build() {
            return (Printer) org.gtk.gobject.GObject.newWithProperties(
                Printer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code true} if the printer is accepting jobs.
         * @param acceptingJobs The value for the {@code accepting-jobs} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAcceptingJobs(boolean acceptingJobs) {
            names.add("accepting-jobs");
            values.add(org.gtk.gobject.Value.create(acceptingJobs));
            return this;
        }
        
        /**
         * {@code true} if this printer can accept PDF.
         * @param acceptsPdf The value for the {@code accepts-pdf} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAcceptsPdf(boolean acceptsPdf) {
            names.add("accepts-pdf");
            values.add(org.gtk.gobject.Value.create(acceptsPdf));
            return this;
        }
        
        /**
         * {@code true} if this printer can accept PostScript.
         * @param acceptsPs The value for the {@code accepts-ps} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAcceptsPs(boolean acceptsPs) {
            names.add("accepts-ps");
            values.add(org.gtk.gobject.Value.create(acceptsPs));
            return this;
        }
        
        /**
         * The backend for the printer.
         * @param backend The value for the {@code backend} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBackend(java.lang.foreign.MemoryAddress backend) {
            names.add("backend");
            values.add(org.gtk.gobject.Value.create(backend));
            return this;
        }
        
        /**
         * Icon name to use for the printer.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * {@code false} if this represents a real hardware device.
         * @param isVirtual The value for the {@code is-virtual} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsVirtual(boolean isVirtual) {
            names.add("is-virtual");
            values.add(org.gtk.gobject.Value.create(isVirtual));
            return this;
        }
        
        /**
         * Number of jobs queued in the printer.
         * @param jobCount The value for the {@code job-count} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setJobCount(int jobCount) {
            names.add("job-count");
            values.add(org.gtk.gobject.Value.create(jobCount));
            return this;
        }
        
        /**
         * Information about the location of the printer.
         * @param location The value for the {@code location} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLocation(java.lang.String location) {
            names.add("location");
            values.add(org.gtk.gobject.Value.create(location));
            return this;
        }
        
        /**
         * The name of the printer.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
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
        public Builder setPaused(boolean paused) {
            names.add("paused");
            values.add(org.gtk.gobject.Value.create(paused));
            return this;
        }
        
        /**
         * String giving the current status of the printer.
         * @param stateMessage The value for the {@code state-message} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStateMessage(java.lang.String stateMessage) {
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
}
