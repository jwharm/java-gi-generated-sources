package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GOptionGroup} struct defines the options in a single
 * group. The struct has only private fields and should not be directly accessed.
 * <p>
 * All options in a group share the same translation function. Libraries which
 * need to parse commandline options are expected to provide a function for
 * getting a {@code GOptionGroup} holding their options, which
 * the application can then add to its {@link OptionContext}.
 */
public class OptionGroup extends io.github.jwharm.javagi.ResourceBase {

    public OptionGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_option_group_new = Interop.downcallHandle(
        "g_option_group_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String name, java.lang.String description, java.lang.String helpDescription, java.lang.foreign.MemoryAddress userData, DestroyNotify destroy) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_option_group_new.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(description).handle(), Interop.allocateNativeString(helpDescription).handle(), userData, 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link OptionGroup}.
     */
    public OptionGroup(java.lang.String name, java.lang.String description, java.lang.String helpDescription, java.lang.foreign.MemoryAddress userData, DestroyNotify destroy) {
        super(constructNew(name, description, helpDescription, userData, destroy));
    }
    
    static final MethodHandle g_option_group_add_entries = Interop.downcallHandle(
        "g_option_group_add_entries",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds the options specified in {@code entries} to {@code group}.
     */
    public void addEntries(OptionEntry[] entries) {
        try {
            g_option_group_add_entries.invokeExact(handle(), Interop.allocateNativeArray(entries).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_option_group_ref = Interop.downcallHandle(
        "g_option_group_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count of {@code group} by one.
     */
    public OptionGroup ref() {
        try {
            var RESULT = (MemoryAddress) g_option_group_ref.invokeExact(handle());
            return new OptionGroup(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_option_group_set_translate_func = Interop.downcallHandle(
        "g_option_group_set_translate_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the function which is used to translate user-visible strings,
     * for {@code --help} output. Different groups can use different
     * {@code GTranslateFuncs}. If {@code func} is {@code null}, strings are not translated.
     * <p>
     * If you are using gettext(), you only need to set the translation
     * domain, see g_option_group_set_translation_domain().
     */
    public void setTranslateFunc(TranslateFunc func) {
        try {
            g_option_group_set_translate_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTranslateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_option_group_set_translation_domain = Interop.downcallHandle(
        "g_option_group_set_translation_domain",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     */
    public void setTranslationDomain(java.lang.String domain) {
        try {
            g_option_group_set_translation_domain.invokeExact(handle(), Interop.allocateNativeString(domain).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_option_group_unref = Interop.downcallHandle(
        "g_option_group_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of {@code group} by one.
     * If the reference count drops to 0, the {@code group} will be freed.
     * and all memory allocated by the {@code group} is released.
     */
    public void unref() {
        try {
            g_option_group_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
