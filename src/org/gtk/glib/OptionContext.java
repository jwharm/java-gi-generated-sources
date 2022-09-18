package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GOptionContext</code> struct defines which options
 * are accepted by the commandline option parser. The struct has only private
 * fields and should not be directly accessed.
 */
public class OptionContext extends io.github.jwharm.javagi.ResourceBase {

    public OptionContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds a {@link org.gtk.glib.OptionGroup} to the @context, so that parsing with @context
     * will recognize the options in the group. Note that this will take
     * ownership of the @group and thus the @group should not be freed.
     */
    public void addGroup(OptionGroup group) {
        gtk_h.g_option_context_add_group(handle(), group.handle());
    }
    
    /**
     * A convenience function which creates a main group if it doesn&<code>#39</code> t
     * exist, adds the @entries to it and sets the translation domain.
     */
    public void addMainEntries(OptionEntry[] entries, java.lang.String translationDomain) {
        gtk_h.g_option_context_add_main_entries(handle(), Interop.allocateNativeArray(entries).handle(), Interop.allocateNativeString(translationDomain).handle());
    }
    
    /**
     * Frees context and all the groups which have been
     * added to it.
     * 
     * Please note that parsed arguments need to be freed separately (see
     * {@link org.gtk.glib.OptionEntry} .
     */
    public void free() {
        gtk_h.g_option_context_free(handle());
    }
    
    /**
     * Returns the description. See g_option_context_set_description().
     */
    public java.lang.String getDescription() {
        var RESULT = gtk_h.g_option_context_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a formatted, translated help text for the given context.
     * To obtain the text produced by <code>--help</code>, call<code>g_option_context_get_help (context, TRUE, NULL)</code>.
     * To obtain the text produced by <code>--help-all</code>, call<code>g_option_context_get_help (context, FALSE, NULL)</code>.
     * To obtain the help text for an option group, call<code>g_option_context_get_help (context, FALSE, group)</code>.
     */
    public java.lang.String getHelp(boolean mainHelp, OptionGroup group) {
        var RESULT = gtk_h.g_option_context_get_help(handle(), mainHelp ? 1 : 0, group.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether automatic <code>--help</code> generation
     * is turned on for @context. See g_option_context_set_help_enabled().
     */
    public boolean getHelpEnabled() {
        var RESULT = gtk_h.g_option_context_get_help_enabled(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether unknown options are ignored or not. See
     * g_option_context_set_ignore_unknown_options().
     */
    public boolean getIgnoreUnknownOptions() {
        var RESULT = gtk_h.g_option_context_get_ignore_unknown_options(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns a pointer to the main group of @context.
     */
    public OptionGroup getMainGroup() {
        var RESULT = gtk_h.g_option_context_get_main_group(handle());
        return new OptionGroup(References.get(RESULT, false));
    }
    
    /**
     * Returns whether strict POSIX code is enabled.
     * 
     * See g_option_context_set_strict_posix() for more information.
     */
    public boolean getStrictPosix() {
        var RESULT = gtk_h.g_option_context_get_strict_posix(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the summary. See g_option_context_set_summary().
     */
    public java.lang.String getSummary() {
        var RESULT = gtk_h.g_option_context_get_summary(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses the command line arguments.
     * 
     * This function is similar to g_option_context_parse() except that it
     * respects the normal memory rules when dealing with a strv instead of
     * assuming that the passed-in array is the argv of the main function.
     * 
     * In particular, strings that are removed from the arguments list will
     * be freed using g_free().
     * 
     * On Windows, the strings are expected to be in UTF-8.  This is in
     * contrast to g_option_context_parse() which expects them to be in the
     * system codepage, which is how they are passed as @argv to main().
     * See g_win32_get_command_line() for a solution.
     * 
     * This function is useful if you are trying to use {@link org.gtk.glib.OptionContext} with
     * {@link org.gtk.gio.Application}
     */
    public boolean parseStrv(java.lang.String[] arguments) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_option_context_parse_strv(handle(), Interop.allocateNativeArray(arguments).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Adds a string to be displayed in <code>--help</code> output after the list
     * of options. This text often includes a bug reporting address.
     * 
     * Note that the summary is translated (see
     * g_option_context_set_translate_func()).
     */
    public void setDescription(java.lang.String description) {
        gtk_h.g_option_context_set_description(handle(), Interop.allocateNativeString(description).handle());
    }
    
    /**
     * Enables or disables automatic generation of <code>--help</code> output.
     * By default, g_option_context_parse() recognizes <code>--help</code>, <code>-h</code>,<code>-?</code>, <code>--help-all</code> and <code>--help-groupname</code> and creates suitable
     * output to stdout.
     */
    public void setHelpEnabled(boolean helpEnabled) {
        gtk_h.g_option_context_set_help_enabled(handle(), helpEnabled ? 1 : 0);
    }
    
    /**
     * Sets whether to ignore unknown options or not. If an argument is
     * ignored, it is left in the @argv array after parsing. By default,
     * g_option_context_parse() treats unknown options as error.
     * 
     * This setting does not affect non-option arguments (i.e. arguments
     * which don&<code>#39</code> t start with a dash). But note that GOption cannot reliably
     * determine whether a non-option belongs to a preceding unknown option.
     */
    public void setIgnoreUnknownOptions(boolean ignoreUnknown) {
        gtk_h.g_option_context_set_ignore_unknown_options(handle(), ignoreUnknown ? 1 : 0);
    }
    
    /**
     * Sets a {@link org.gtk.glib.OptionGroup} as main group of the @context.
     * This has the same effect as calling g_option_context_add_group(),
     * the only difference is that the options in the main group are
     * treated differently when generating <code>--help</code> output.
     */
    public void setMainGroup(OptionGroup group) {
        gtk_h.g_option_context_set_main_group(handle(), group.handle());
    }
    
    /**
     * Sets strict POSIX mode.
     * 
     * By default, this mode is disabled.
     * 
     * In strict POSIX mode, the first non-argument parameter encountered
     * (eg: filename) terminates argument processing.  Remaining arguments
     * are treated as non-options and are not attempted to be parsed.
     * 
     * If strict POSIX mode is disabled then parsing is done in the GNU way
     * where option arguments can be freely mixed with non-options.
     * 
     * As an example, consider &<code>#34</code> ls foo -l&<code>#34</code> .  With GNU style parsing, this
     * will list &<code>#34</code> foo&<code>#34</code>  in long mode.  In strict POSIX style, this will list
     * the files named &<code>#34</code> foo&<code>#34</code>  and &<code>#34</code> -l&<code>#34</code> .
     * 
     * It may be useful to force strict POSIX mode when creating &<code>#34</code> verb
     * style&<code>#34</code>  command line tools.  For example, the &<code>#34</code> gsettings&<code>#34</code>  command line
     * tool supports the global option &<code>#34</code> --schemadir&<code>#34</code>  as well as many
     * subcommands (&<code>#34</code> get&<code>#34</code> , &<code>#34</code> set&<code>#34</code> , etc.) which each have their own set of
     * arguments.  Using strict POSIX mode will allow parsing the global
     * options up to the verb name while leaving the remaining options to be
     * parsed by the relevant subcommand (which can be determined by
     * examining the verb name, which should be present in argv{@link [1]} after
     * parsing).
     */
    public void setStrictPosix(boolean strictPosix) {
        gtk_h.g_option_context_set_strict_posix(handle(), strictPosix ? 1 : 0);
    }
    
    /**
     * Adds a string to be displayed in <code>--help</code> output before the list
     * of options. This is typically a summary of the program functionality.
     * 
     * Note that the summary is translated (see
     * g_option_context_set_translate_func() and
     * g_option_context_set_translation_domain()).
     */
    public void setSummary(java.lang.String summary) {
        gtk_h.g_option_context_set_summary(handle(), Interop.allocateNativeString(summary).handle());
    }
    
    /**
     * Sets the function which is used to translate the contexts
     * user-visible strings, for <code>--help</code> output. If @func is <code>null</code> 
     * strings are not translated.
     * 
     * Note that option groups have their own translation functions,
     * this function only affects the @parameter_string (see g_option_context_new()),
     * the summary (see g_option_context_set_summary()) and the description
     * (see g_option_context_set_description()).
     * 
     * If you are using gettext(), you only need to set the translation
     * domain, see g_option_context_set_translation_domain().
     */
    public void setTranslateFunc(TranslateFunc func) {
        try {
            gtk_h.g_option_context_set_translate_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
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
        gtk_h.g_option_context_set_translation_domain(handle(), Interop.allocateNativeString(domain).handle());
    }
    
    /**
     * Creates a new option context.
     * 
     * The @parameter_string can serve multiple purposes. It can be used
     * to add descriptions for &<code>#34</code> rest&<code>#34</code>  arguments, which are not parsed by
     * the {@link org.gtk.glib.OptionContext}  typically something like &<code>#34</code> FILES&<code>#34</code>  or
     * &<code>#34</code> FILE1 FILE2...&<code>#34</code> . If you are using <code>G_OPTION_REMAINING</code> for
     * collecting &<code>#34</code> rest&<code>#34</code>  arguments, GLib handles this automatically by
     * using the @arg_description of the corresponding {@link org.gtk.glib.OptionEntry} in
     * the usage summary.
     * 
     * Another usage is to give a short summary of the program
     * functionality, like &<code>#34</code>  - frob the strings&<code>#34</code> , which will be displayed
     * in the same line as the usage. For a longer description of the
     * program functionality that should be displayed as a paragraph
     * below the usage line, use g_option_context_set_summary().
     * 
     * Note that the @parameter_string is translated using the
     * function set with g_option_context_set_translate_func(), so
     * it should normally be passed untranslated.
     */
    public static OptionContext new_(java.lang.String parameterString) {
        var RESULT = gtk_h.g_option_context_new(Interop.allocateNativeString(parameterString).handle());
        return new OptionContext(References.get(RESULT, false));
    }
    
}
