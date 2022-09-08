package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GOptionContext` struct defines which options
 * are accepted by the commandline option parser. The struct has only private
 * fields and should not be directly accessed.
 */
public class OptionContext extends io.github.jwharm.javagi.interop.ResourceBase {

    public OptionContext(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds a #GOptionGroup to the @context, so that parsing with @context
     * will recognize the options in the group. Note that this will take
     * ownership of the @group and thus the @group should not be freed.
     */
    public void addGroup(OptionGroup group) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_add_group(HANDLE(), group.HANDLE());
    }
    
    /**
     * A convenience function which creates a main group if it doesn't
     * exist, adds the @entries to it and sets the translation domain.
     */
    public void addMainEntries(OptionEntry[] entries, java.lang.String translationDomain) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_add_main_entries(HANDLE(), Interop.allocateNativeArray(entries), Interop.allocateNativeString(translationDomain).HANDLE());
    }
    
    /**
     * Frees context and all the groups which have been
     * added to it.
     * 
     * Please note that parsed arguments need to be freed separately (see
     * #GOptionEntry).
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_free(HANDLE());
    }
    
    /**
     * Returns the description. See g_option_context_set_description().
     */
    public java.lang.String getDescription() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_get_description(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a formatted, translated help text for the given context.
     * To obtain the text produced by `--help`, call
     * `g_option_context_get_help (context, TRUE, NULL)`.
     * To obtain the text produced by `--help-all`, call
     * `g_option_context_get_help (context, FALSE, NULL)`.
     * To obtain the help text for an option group, call
     * `g_option_context_get_help (context, FALSE, group)`.
     */
    public java.lang.String getHelp(boolean mainHelp, OptionGroup group) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_get_help(HANDLE(), mainHelp ? 1 : 0, group.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether automatic `--help` generation
     * is turned on for @context. See g_option_context_set_help_enabled().
     */
    public boolean getHelpEnabled() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_get_help_enabled(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether unknown options are ignored or not. See
     * g_option_context_set_ignore_unknown_options().
     */
    public boolean getIgnoreUnknownOptions() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_get_ignore_unknown_options(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns a pointer to the main group of @context.
     */
    public OptionGroup getMainGroup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_get_main_group(HANDLE());
        return new OptionGroup(References.get(RESULT, false));
    }
    
    /**
     * Returns whether strict POSIX code is enabled.
     * 
     * See g_option_context_set_strict_posix() for more information.
     */
    public boolean getStrictPosix() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_get_strict_posix(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the summary. See g_option_context_set_summary().
     */
    public java.lang.String getSummary() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_get_summary(HANDLE());
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
     * This function is useful if you are trying to use #GOptionContext with
     * #GApplication.
     */
    public boolean parseStrv(java.lang.String[] arguments) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_parse_strv(HANDLE(), Interop.allocateNativeArray(arguments), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Adds a string to be displayed in `--help` output after the list
     * of options. This text often includes a bug reporting address.
     * 
     * Note that the summary is translated (see
     * g_option_context_set_translate_func()).
     */
    public void setDescription(java.lang.String description) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_set_description(HANDLE(), Interop.allocateNativeString(description).HANDLE());
    }
    
    /**
     * Enables or disables automatic generation of `--help` output.
     * By default, g_option_context_parse() recognizes `--help`, `-h`,
     * `-?`, `--help-all` and `--help-groupname` and creates suitable
     * output to stdout.
     */
    public void setHelpEnabled(boolean helpEnabled) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_set_help_enabled(HANDLE(), helpEnabled ? 1 : 0);
    }
    
    /**
     * Sets whether to ignore unknown options or not. If an argument is
     * ignored, it is left in the @argv array after parsing. By default,
     * g_option_context_parse() treats unknown options as error.
     * 
     * This setting does not affect non-option arguments (i.e. arguments
     * which don't start with a dash). But note that GOption cannot reliably
     * determine whether a non-option belongs to a preceding unknown option.
     */
    public void setIgnoreUnknownOptions(boolean ignoreUnknown) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_set_ignore_unknown_options(HANDLE(), ignoreUnknown ? 1 : 0);
    }
    
    /**
     * Sets a #GOptionGroup as main group of the @context.
     * This has the same effect as calling g_option_context_add_group(),
     * the only difference is that the options in the main group are
     * treated differently when generating `--help` output.
     */
    public void setMainGroup(OptionGroup group) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_set_main_group(HANDLE(), group.HANDLE());
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
     * As an example, consider "ls foo -l".  With GNU style parsing, this
     * will list "foo" in long mode.  In strict POSIX style, this will list
     * the files named "foo" and "-l".
     * 
     * It may be useful to force strict POSIX mode when creating "verb
     * style" command line tools.  For example, the "gsettings" command line
     * tool supports the global option "--schemadir" as well as many
     * subcommands ("get", "set", etc.) which each have their own set of
     * arguments.  Using strict POSIX mode will allow parsing the global
     * options up to the verb name while leaving the remaining options to be
     * parsed by the relevant subcommand (which can be determined by
     * examining the verb name, which should be present in argv[1] after
     * parsing).
     */
    public void setStrictPosix(boolean strictPosix) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_set_strict_posix(HANDLE(), strictPosix ? 1 : 0);
    }
    
    /**
     * Adds a string to be displayed in `--help` output before the list
     * of options. This is typically a summary of the program functionality.
     * 
     * Note that the summary is translated (see
     * g_option_context_set_translate_func() and
     * g_option_context_set_translation_domain()).
     */
    public void setSummary(java.lang.String summary) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_set_summary(HANDLE(), Interop.allocateNativeString(summary).HANDLE());
    }
    
    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     */
    public void setTranslationDomain(java.lang.String domain) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_option_context_set_translation_domain(HANDLE(), Interop.allocateNativeString(domain).HANDLE());
    }
    
}
