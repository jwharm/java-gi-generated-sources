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

    public Printer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Printer */
    public static Printer castFrom(org.gtk.gobject.Object gobject) {
        return new Printer(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_printer_new = Interop.downcallHandle(
        "gtk_printer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String name, @NotNull PrintBackend backend, @NotNull boolean virtual) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_printer_new.invokeExact(Interop.allocateNativeString(name), backend.handle(), virtual ? 1 : 0), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkPrinter}.
     */
    public Printer(@NotNull java.lang.String name, @NotNull PrintBackend backend, @NotNull boolean virtual) {
        super(constructNew(name, backend, virtual));
    }
    
    private static final MethodHandle gtk_printer_accepts_pdf = Interop.downcallHandle(
        "gtk_printer_accepts_pdf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer accepts input in
     * PDF format.
     */
    public boolean acceptsPdf() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_accepts_pdf.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_accepts_ps = Interop.downcallHandle(
        "gtk_printer_accepts_ps",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer accepts input in
     * PostScript format.
     */
    public boolean acceptsPs() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_accepts_ps.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_compare = Interop.downcallHandle(
        "gtk_printer_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two printers.
     */
    public int compare(@NotNull Printer b) {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_compare.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_printer_get_backend = Interop.downcallHandle(
        "gtk_printer_get_backend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the backend of the printer.
     */
    public @NotNull PrintBackend getBackend() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_printer_get_backend.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintBackend(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_printer_get_capabilities = Interop.downcallHandle(
        "gtk_printer_get_capabilities",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull PrintCapabilities getCapabilities() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_get_capabilities.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PrintCapabilities(RESULT);
    }
    
    private static final MethodHandle gtk_printer_get_default_page_size = Interop.downcallHandle(
        "gtk_printer_get_default_page_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns default page size of {@code printer}.
     */
    public @NotNull PageSetup getDefaultPageSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_printer_get_default_page_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PageSetup(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_printer_get_description = Interop.downcallHandle(
        "gtk_printer_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the description of the printer.
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_printer_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_printer_get_hard_margins = Interop.downcallHandle(
        "gtk_printer_get_hard_margins",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieve the hard margins of {@code printer}.
     * <p>
     * These are the margins that define the area at the borders
     * of the paper that the printer cannot print to.
     * <p>
     * Note: This will not succeed unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public boolean getHardMargins(@NotNull Out<Double> top, @NotNull Out<Double> bottom, @NotNull Out<Double> left, @NotNull Out<Double> right) {
        MemorySegment topPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment rightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) gtk_printer_get_hard_margins.invokeExact(handle(), (Addressable) topPOINTER.address(), (Addressable) bottomPOINTER.address(), (Addressable) leftPOINTER.address(), (Addressable) rightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        top.set(topPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        bottom.set(bottomPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        left.set(leftPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        right.set(rightPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_get_hard_margins_for_paper_size = Interop.downcallHandle(
        "gtk_printer_get_hard_margins_for_paper_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieve the hard margins of {@code printer} for {@code paper_size}.
     * <p>
     * These are the margins that define the area at the borders
     * of the paper that the printer cannot print to.
     * <p>
     * Note: This will not succeed unless the printer’s details are
     * available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public boolean getHardMarginsForPaperSize(@NotNull PaperSize paperSize, @NotNull Out<Double> top, @NotNull Out<Double> bottom, @NotNull Out<Double> left, @NotNull Out<Double> right) {
        MemorySegment topPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment bottomPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment leftPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment rightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) gtk_printer_get_hard_margins_for_paper_size.invokeExact(handle(), paperSize.handle(), (Addressable) topPOINTER.address(), (Addressable) bottomPOINTER.address(), (Addressable) leftPOINTER.address(), (Addressable) rightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        top.set(topPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        bottom.set(bottomPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        left.set(leftPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        right.set(rightPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_get_icon_name = Interop.downcallHandle(
        "gtk_printer_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the icon to use for the printer.
     */
    public @NotNull java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_printer_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_printer_get_job_count = Interop.downcallHandle(
        "gtk_printer_get_job_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of jobs currently queued on the printer.
     */
    public int getJobCount() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_get_job_count.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_printer_get_location = Interop.downcallHandle(
        "gtk_printer_get_location",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a description of the location of the printer.
     */
    public @NotNull java.lang.String getLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_printer_get_location.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_printer_get_name = Interop.downcallHandle(
        "gtk_printer_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the printer.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_printer_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_printer_get_state_message = Interop.downcallHandle(
        "gtk_printer_get_state_message",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the state message describing the current state
     * of the printer.
     */
    public @NotNull java.lang.String getStateMessage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_printer_get_state_message.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_printer_has_details = Interop.downcallHandle(
        "gtk_printer_has_details",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer details are available.
     */
    public boolean hasDetails() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_has_details.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_is_accepting_jobs = Interop.downcallHandle(
        "gtk_printer_is_accepting_jobs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is accepting jobs
     */
    public boolean isAcceptingJobs() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_is_accepting_jobs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_is_active = Interop.downcallHandle(
        "gtk_printer_is_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is currently active (i.e.
     * accepts new jobs).
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_is_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_is_default = Interop.downcallHandle(
        "gtk_printer_is_default",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is the default printer.
     */
    public boolean isDefault() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_is_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_is_paused = Interop.downcallHandle(
        "gtk_printer_is_paused",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is currently paused.
     * <p>
     * A paused printer still accepts jobs, but it is not
     * printing them.
     */
    public boolean isPaused() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_is_paused.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_is_virtual = Interop.downcallHandle(
        "gtk_printer_is_virtual",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the printer is virtual (i.e. does not
     * represent actual printer hardware, but something like
     * a CUPS class).
     */
    public boolean isVirtual() {
        int RESULT;
        try {
            RESULT = (int) gtk_printer_is_virtual.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_printer_list_papers = Interop.downcallHandle(
        "gtk_printer_list_papers",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lists all the paper sizes {@code printer} supports.
     * <p>
     * This will return and empty list unless the printer’s details
     * are available, see {@link Printer#hasDetails} and
     * {@link Printer#requestDetails}.
     */
    public @NotNull org.gtk.glib.List listPapers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_printer_list_papers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_printer_request_details = Interop.downcallHandle(
        "gtk_printer_request_details",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Requests the printer details.
     * <p>
     * When the details are available, the
     * {@code Gtk.Printer::details-acquired} signal
     * will be emitted on {@code printer}.
     */
    public @NotNull void requestDetails() {
        try {
            gtk_printer_request_details.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DetailsAcquiredHandler {
        void signalReceived(Printer source, @NotNull boolean success);
    }
    
    /**
     * Emitted in response to a request for detailed information
     * about a printer from the print backend.
     * <p>
     * The {@code success} parameter indicates if the information was
     * actually obtained.
     */
    public SignalHandle onDetailsAcquired(DetailsAcquiredHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("details-acquired"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Printer.Callbacks.class, "signalPrinterDetailsAcquired",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalPrinterDetailsAcquired(MemoryAddress source, int success, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Printer.DetailsAcquiredHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Printer(Refcounted.get(source)), success != 0);
        }
        
    }
}
