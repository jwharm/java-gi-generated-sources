package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCalendar} is a widget that displays a Gregorian calendar, one month
 * at a time.
 * <p>
 * <img src="./doc-files/calendar.png" alt="An example GtkCalendar">
 * <p>
 * A {@code GtkCalendar} can be created with {@link Calendar#Calendar}.
 * <p>
 * The date that is currently displayed can be altered with
 * {@link Calendar#selectDay}.
 * <p>
 * To place a visual marker on a particular day, use
 * {@link Calendar#markDay} and to remove the marker,
 * {@link Calendar#unmarkDay}. Alternative, all
 * marks can be cleared with {@link Calendar#clearMarks}.
 * <p>
 * The selected date can be retrieved from a {@code GtkCalendar} using
 * {@link Calendar#getDate}.
 * <p>
 * Users should be aware that, although the Gregorian calendar is the
 * legal calendar in most countries, it was adopted progressively
 * between 1582 and 1929. Display before these dates is likely to be
 * historically incorrect.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * calendar.view
 * ├── header
 * │   ├── button
 * │   ├── stack.month
 * │   ├── button
 * │   ├── button
 * │   ├── label.year
 * │   ╰── button
 * ╰── grid
 *     ╰── label[.day-name][.week-number][.day-number][.other-month][.today]
 * }</pre>
 * <p>
 * {@code GtkCalendar} has a main node with name calendar. It contains a subnode
 * called header containing the widgets for switching between years and months.
 * <p>
 * The grid subnode contains all day labels, including week numbers on the left
 * (marked with the .week-number css class) and day names on top (marked with the
 * .day-name css class).
 * <p>
 * Day labels that belong to the previous or next month get the .other-month
 * style class. The label of the current day get the .today style class.
 * <p>
 * Marked day labels get the :selected state assigned.
 */
public class Calendar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCalendar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Calendar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Calendar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Calendar if its GType is a (or inherits from) "GtkCalendar".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Calendar" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCalendar", a ClassCastException will be thrown.
     */
    public static Calendar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCalendar"))) {
            return new Calendar(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCalendar");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_calendar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new calendar, with the current date being selected.
     */
    public Calendar() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Remove all visual markers.
     */
    public void clearMarks() {
        try {
            DowncallHandles.gtk_calendar_clear_marks.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a {@code GDateTime} representing the shown
     * year, month and the selected day.
     * <p>
     * The returned date is in the local time zone.
     * @return the {@code GDate} representing the shown date
     */
    public @NotNull org.gtk.glib.DateTime getDate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_calendar_get_date.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateTime(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns if the {@code day} of the {@code calendar} is already marked.
     * @param day the day number between 1 and 31.
     * @return whether the day is marked.
     */
    public boolean getDayIsMarked(int day) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_calendar_get_day_is_marked.invokeExact(
                    handle(),
                    day);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code self} is currently showing the names
     * of the week days.
     * <p>
     * This is the value of the {@code Gtk.Calendar:show-day-names}
     * property.
     * @return Whether the calendar shows day names.
     */
    public boolean getShowDayNames() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_calendar_get_show_day_names.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code self} is currently showing the heading.
     * <p>
     * This is the value of the {@code Gtk.Calendar:show-heading}
     * property.
     * @return Whether the calendar is showing a heading.
     */
    public boolean getShowHeading() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_calendar_get_show_heading.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code self} is showing week numbers right
     * now.
     * <p>
     * This is the value of the {@code Gtk.Calendar:show-week-numbers}
     * property.
     * @return Whether the calendar is showing week numbers.
     */
    public boolean getShowWeekNumbers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_calendar_get_show_week_numbers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Places a visual marker on a particular day.
     * @param day the day number to mark between 1 and 31.
     */
    public void markDay(int day) {
        try {
            DowncallHandles.gtk_calendar_mark_day.invokeExact(
                    handle(),
                    day);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Switches to {@code date}'s year and month and select its day.
     * @param date a {@code GDateTime} representing the day to select
     */
    public void selectDay(@NotNull org.gtk.glib.DateTime date) {
        java.util.Objects.requireNonNull(date, "Parameter 'date' must not be null");
        try {
            DowncallHandles.gtk_calendar_select_day.invokeExact(
                    handle(),
                    date.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the calendar shows day names.
     * @param value Whether to show day names above the day numbers
     */
    public void setShowDayNames(boolean value) {
        try {
            DowncallHandles.gtk_calendar_set_show_day_names.invokeExact(
                    handle(),
                    value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the calendar should show a heading.
     * <p>
     * The heading contains the current year and month as well as
     * buttons for changing both.
     * @param value Whether to show the heading in the calendar
     */
    public void setShowHeading(boolean value) {
        try {
            DowncallHandles.gtk_calendar_set_show_heading.invokeExact(
                    handle(),
                    value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether week numbers are shown in the calendar.
     * @param value whether to show week numbers on the left of the days
     */
    public void setShowWeekNumbers(boolean value) {
        try {
            DowncallHandles.gtk_calendar_set_show_week_numbers.invokeExact(
                    handle(),
                    value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the visual marker from a particular day.
     * @param day the day number to unmark between 1 and 31.
     */
    public void unmarkDay(int day) {
        try {
            DowncallHandles.gtk_calendar_unmark_day.invokeExact(
                    handle(),
                    day);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DaySelected {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when the user selects a day.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Calendar.DaySelected> onDaySelected(Calendar.DaySelected handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("day-selected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarDaySelected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Calendar.DaySelected>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NextMonth {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when the user switched to the next month.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Calendar.NextMonth> onNextMonth(Calendar.NextMonth handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("next-month"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarNextMonth",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Calendar.NextMonth>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NextYear {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when user switched to the next year.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Calendar.NextYear> onNextYear(Calendar.NextYear handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("next-year"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarNextYear",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Calendar.NextYear>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PrevMonth {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when the user switched to the previous month.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Calendar.PrevMonth> onPrevMonth(Calendar.PrevMonth handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("prev-month"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarPrevMonth",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Calendar.PrevMonth>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PrevYear {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when user switched to the previous year.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Calendar.PrevYear> onPrevYear(Calendar.PrevYear handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("prev-year"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarPrevYear",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Calendar.PrevYear>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_calendar_new = Interop.downcallHandle(
            "gtk_calendar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_calendar_clear_marks = Interop.downcallHandle(
            "gtk_calendar_clear_marks",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_calendar_get_date = Interop.downcallHandle(
            "gtk_calendar_get_date",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_calendar_get_day_is_marked = Interop.downcallHandle(
            "gtk_calendar_get_day_is_marked",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_calendar_get_show_day_names = Interop.downcallHandle(
            "gtk_calendar_get_show_day_names",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_calendar_get_show_heading = Interop.downcallHandle(
            "gtk_calendar_get_show_heading",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_calendar_get_show_week_numbers = Interop.downcallHandle(
            "gtk_calendar_get_show_week_numbers",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_calendar_mark_day = Interop.downcallHandle(
            "gtk_calendar_mark_day",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_calendar_select_day = Interop.downcallHandle(
            "gtk_calendar_select_day",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_calendar_set_show_day_names = Interop.downcallHandle(
            "gtk_calendar_set_show_day_names",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_calendar_set_show_heading = Interop.downcallHandle(
            "gtk_calendar_set_show_heading",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_calendar_set_show_week_numbers = Interop.downcallHandle(
            "gtk_calendar_set_show_week_numbers",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_calendar_unmark_day = Interop.downcallHandle(
            "gtk_calendar_unmark_day",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalCalendarDaySelected(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Calendar.DaySelected) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Calendar(source, Ownership.UNKNOWN));
        }
        
        public static void signalCalendarNextMonth(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Calendar.NextMonth) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Calendar(source, Ownership.UNKNOWN));
        }
        
        public static void signalCalendarNextYear(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Calendar.NextYear) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Calendar(source, Ownership.UNKNOWN));
        }
        
        public static void signalCalendarPrevMonth(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Calendar.PrevMonth) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Calendar(source, Ownership.UNKNOWN));
        }
        
        public static void signalCalendarPrevYear(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Calendar.PrevYear) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Calendar(source, Ownership.UNKNOWN));
        }
    }
}
