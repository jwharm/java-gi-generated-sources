package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkStringSorter} is a {@code GtkSorter} that compares strings.
 * <p>
 * It does the comparison in a linguistically correct way using the
 * current locale by normalizing Unicode strings and possibly case-folding
 * them before performing the comparison.
 * <p>
 * To obtain the strings to compare, this sorter evaluates a
 * {@link Expression}.
 */
public class StringSorter extends org.gtk.gtk.Sorter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStringSorter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a StringSorter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected StringSorter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, StringSorter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new StringSorter(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Expression expression) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_sorter_new.invokeExact(
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        expression.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new string sorter that compares items using the given
     * {@code expression}.
     * <p>
     * Unless an expression is set on it, this sorter will always
     * compare items as invalid.
     * @param expression The expression to evaluate
     */
    public StringSorter(@Nullable org.gtk.gtk.Expression expression) {
        super(constructNew(expression), Ownership.FULL);
    }
    
    /**
     * Gets the expression that is evaluated to obtain strings from items.
     * @return a {@code GtkExpression}
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_sorter_get_expression.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Expression) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Expression.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the sorter ignores case differences.
     * @return {@code true} if {@code self} is ignoring case differences
     */
    public boolean getIgnoreCase() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_string_sorter_get_ignore_case.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the expression that is evaluated to obtain strings from items.
     * <p>
     * The expression must have the type {@code G_TYPE_STRING}.
     * @param expression a {@code GtkExpression}
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        try {
            DowncallHandles.gtk_string_sorter_set_expression.invokeExact(
                    handle(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the sorter will ignore case differences.
     * @param ignoreCase {@code true} to ignore case differences
     */
    public void setIgnoreCase(boolean ignoreCase) {
        try {
            DowncallHandles.gtk_string_sorter_set_ignore_case.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(ignoreCase, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_string_sorter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link StringSorter.Builder} object constructs a {@link StringSorter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link StringSorter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Sorter.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link StringSorter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StringSorter}.
         * @return A new instance of {@code StringSorter} with the properties 
         *         that were set in the Builder object.
         */
        public StringSorter build() {
            return (StringSorter) org.gtk.gobject.GObject.newWithProperties(
                StringSorter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The expression to evaluate on item to get a string to compare with.
         * @param expression The value for the {@code expression} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExpression(org.gtk.gtk.Expression expression) {
            names.add("expression");
            values.add(org.gtk.gobject.Value.create(expression));
            return this;
        }
        
        /**
         * If matching is case sensitive.
         * @param ignoreCase The value for the {@code ignore-case} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIgnoreCase(boolean ignoreCase) {
            names.add("ignore-case");
            values.add(org.gtk.gobject.Value.create(ignoreCase));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_string_sorter_new = Interop.downcallHandle(
            "gtk_string_sorter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_sorter_get_expression = Interop.downcallHandle(
            "gtk_string_sorter_get_expression",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_sorter_get_ignore_case = Interop.downcallHandle(
            "gtk_string_sorter_get_ignore_case",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_sorter_set_expression = Interop.downcallHandle(
            "gtk_string_sorter_set_expression",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_sorter_set_ignore_case = Interop.downcallHandle(
            "gtk_string_sorter_set_ignore_case",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_string_sorter_get_type = Interop.downcallHandle(
            "gtk_string_sorter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
