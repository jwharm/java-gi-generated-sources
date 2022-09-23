package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public OptionGroup(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String name, java.lang.String description, java.lang.String helpDescription, java.lang.foreign.MemoryAddress userData, DestroyNotify destroy) {
        Reference RESULT = References.get(gtk_h.g_option_group_new(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(description).handle(), Interop.allocateNativeString(helpDescription).handle(), userData, 
                    Interop.cbDestroyNotifySymbol()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link OptionGroup}.
     */
    public OptionGroup(java.lang.String name, java.lang.String description, java.lang.String helpDescription, java.lang.foreign.MemoryAddress userData, DestroyNotify destroy) {
        super(constructNew(name, description, helpDescription, userData, destroy));
    }
    
    /**
     * Adds the options specified in {@code entries} to {@code group}.
     */
    public void addEntries(OptionEntry[] entries) {
        gtk_h.g_option_group_add_entries(handle(), Interop.allocateNativeArray(entries).handle());
    }
    
    /**
     * Increments the reference count of {@code group} by one.
     */
    public OptionGroup ref() {
        var RESULT = gtk_h.g_option_group_ref(handle());
        return new OptionGroup(References.get(RESULT, true));
    }
    
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
            gtk_h.g_option_group_set_translate_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTranslateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     */
    public void setTranslationDomain(java.lang.String domain) {
        gtk_h.g_option_group_set_translation_domain(handle(), Interop.allocateNativeString(domain).handle());
    }
    
    /**
     * Decrements the reference count of {@code group} by one.
     * If the reference count drops to 0, the {@code group} will be freed.
     * and all memory allocated by the {@code group} is released.
     */
    public void unref() {
        gtk_h.g_option_group_unref(handle());
    }
    
}
