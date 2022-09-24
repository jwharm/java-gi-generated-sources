package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkAboutDialog} offers a simple way to display information about
 * a program.
 * <p>
 * The shown information includes the programs' logo, name, copyright,
 * website and license. It is also possible to give credits to the authors,
 * documenters, translators and artists who have worked on the program.
 * <p>
 * An about dialog is typically opened when the user selects the {@code About}
 * option from the {@code Help} menu. All parts of the dialog are optional.
 * <p>
 * <img src="./doc-files/aboutdialog.png" alt="An example GtkAboutDialog">
 * <p>
 * About dialogs often contain links and email addresses. {@code GtkAboutDialog}
 * displays these as clickable links. By default, it calls {@link Gtk#showUri}
 * when a user clicks one. The behaviour can be overridden with the
 * {@code Gtk.AboutDialog::activate-link} signal.
 * <p>
 * To specify a person with an email address, use a string like
 * {@code Edgar Allan Poe <edgar@poe.com>}. To specify a website with a title,
 * use a string like {@code GTK team https://www.gtk.org}.
 * <p>
 * To make constructing a {@code GtkAboutDialog} as convenient as possible, you can
 * use the function {@link Gtk#showAboutDialog} which constructs and shows
 * a dialog and keeps it around so that it can be shown again.
 * <p>
 * Note that GTK sets a default title of {@code _("About %s")} on the dialog
 * window (where {@code %s} is replaced by the name of the application, but in
 * order to ensure proper translation of the title, applications should
 * set the title property explicitly when constructing a {@code GtkAboutDialog},
 * as shown in the following example:
 * <p>
 * <pre>{@code c
 * GFile *logo_file = g_file_new_for_path ("./logo.png");
 * GdkTexture *example_logo = gdk_texture_new_from_file (logo_file, NULL);
 * g_object_unref (logo_file);
 * 
 * gtk_show_about_dialog (NULL,
 *                        "program-name", "ExampleCode",
 *                        "logo", example_logo,
 *                        "title", _("About ExampleCode"),
 *                        NULL);
 * }</pre>
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code GtkAboutDialog} has a single CSS node with the name {@code window} and style
 * class {@code .aboutdialog}.
 */
public class AboutDialog extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public AboutDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AboutDialog */
    public static AboutDialog castFrom(org.gtk.gobject.Object gobject) {
        return new AboutDialog(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_about_dialog_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAboutDialog}.
     */
    public AboutDialog() {
        super(constructNew());
    }
    
    /**
     * Creates a new section in the "Credits" page.
     */
    public void addCreditSection(java.lang.String sectionName, java.lang.String[] people) {
        gtk_h.gtk_about_dialog_add_credit_section(handle(), Interop.allocateNativeString(sectionName).handle(), Interop.allocateNativeArray(people).handle());
    }
    
    /**
     * Returns the comments string.
     */
    public java.lang.String getComments() {
        var RESULT = gtk_h.gtk_about_dialog_get_comments(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the copyright string.
     */
    public java.lang.String getCopyright() {
        var RESULT = gtk_h.gtk_about_dialog_get_copyright(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the license information.
     */
    public java.lang.String getLicense() {
        var RESULT = gtk_h.gtk_about_dialog_get_license(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the license type.
     */
    public License getLicenseType() {
        var RESULT = gtk_h.gtk_about_dialog_get_license_type(handle());
        return License.fromValue(RESULT);
    }
    
    /**
     * Returns the paintable displayed as logo in the about dialog.
     */
    public org.gtk.gdk.Paintable getLogo() {
        var RESULT = gtk_h.gtk_about_dialog_get_logo(handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns the icon name displayed as logo in the about dialog.
     */
    public java.lang.String getLogoIconName() {
        var RESULT = gtk_h.gtk_about_dialog_get_logo_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the program name displayed in the about dialog.
     */
    public java.lang.String getProgramName() {
        var RESULT = gtk_h.gtk_about_dialog_get_program_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the system information that is shown in the about dialog.
     */
    public java.lang.String getSystemInformation() {
        var RESULT = gtk_h.gtk_about_dialog_get_system_information(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the translator credits string which is displayed
     * in the credits page.
     */
    public java.lang.String getTranslatorCredits() {
        var RESULT = gtk_h.gtk_about_dialog_get_translator_credits(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the version string.
     */
    public java.lang.String getVersion() {
        var RESULT = gtk_h.gtk_about_dialog_get_version(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the website URL.
     */
    public java.lang.String getWebsite() {
        var RESULT = gtk_h.gtk_about_dialog_get_website(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the label used for the website link.
     */
    public java.lang.String getWebsiteLabel() {
        var RESULT = gtk_h.gtk_about_dialog_get_website_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the license text in the about dialog is
     * automatically wrapped.
     */
    public boolean getWrapLicense() {
        var RESULT = gtk_h.gtk_about_dialog_get_wrap_license(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the names of the artists to be displayed
     * in the "Credits" page.
     */
    public void setArtists(java.lang.String[] artists) {
        gtk_h.gtk_about_dialog_set_artists(handle(), Interop.allocateNativeArray(artists).handle());
    }
    
    /**
     * Sets the names of the authors which are displayed
     * in the "Credits" page of the about dialog.
     */
    public void setAuthors(java.lang.String[] authors) {
        gtk_h.gtk_about_dialog_set_authors(handle(), Interop.allocateNativeArray(authors).handle());
    }
    
    /**
     * Sets the comments string to display in the about dialog.
     * <p>
     * This should be a short string of one or two lines.
     */
    public void setComments(java.lang.String comments) {
        gtk_h.gtk_about_dialog_set_comments(handle(), Interop.allocateNativeString(comments).handle());
    }
    
    /**
     * Sets the copyright string to display in the about dialog.
     * <p>
     * This should be a short string of one or two lines.
     */
    public void setCopyright(java.lang.String copyright) {
        gtk_h.gtk_about_dialog_set_copyright(handle(), Interop.allocateNativeString(copyright).handle());
    }
    
    /**
     * Sets the names of the documenters which are displayed
     * in the "Credits" page.
     */
    public void setDocumenters(java.lang.String[] documenters) {
        gtk_h.gtk_about_dialog_set_documenters(handle(), Interop.allocateNativeArray(documenters).handle());
    }
    
    /**
     * Sets the license information to be displayed in the
     * about dialog.
     * <p>
     * If {@code license} is {@code NULL}, the license page is hidden.
     */
    public void setLicense(java.lang.String license) {
        gtk_h.gtk_about_dialog_set_license(handle(), Interop.allocateNativeString(license).handle());
    }
    
    /**
     * Sets the license of the application showing the about dialog from a
     * list of known licenses.
     * <p>
     * This function overrides the license set using
     * {@link AboutDialog#setLicense}.
     */
    public void setLicenseType(License licenseType) {
        gtk_h.gtk_about_dialog_set_license_type(handle(), licenseType.getValue());
    }
    
    /**
     * Sets the logo in the about dialog.
     */
    public void setLogo(org.gtk.gdk.Paintable logo) {
        gtk_h.gtk_about_dialog_set_logo(handle(), logo.handle());
    }
    
    /**
     * Sets the icon name to be displayed as logo in the about dialog.
     */
    public void setLogoIconName(java.lang.String iconName) {
        gtk_h.gtk_about_dialog_set_logo_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the name to display in the about dialog.
     * <p>
     * If {@code name} is not set, the string returned
     * by {@code g_get_application_name()} is used.
     */
    public void setProgramName(java.lang.String name) {
        gtk_h.gtk_about_dialog_set_program_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the system information to be displayed in the about
     * dialog.
     * <p>
     * If {@code system_information} is {@code NULL}, the system information
     * page is hidden.
     * <p>
     * See {@code Gtk.AboutDialog:system-information}.
     */
    public void setSystemInformation(java.lang.String systemInformation) {
        gtk_h.gtk_about_dialog_set_system_information(handle(), Interop.allocateNativeString(systemInformation).handle());
    }
    
    /**
     * Sets the translator credits string which is displayed in
     * the credits page.
     * <p>
     * The intended use for this string is to display the translator
     * of the language which is currently used in the user interface.
     * Using {@code gettext()}, a simple way to achieve that is to mark the
     * string for translation:
     * <p>
     * <pre>{@code c
     * GtkWidget *about = gtk_about_dialog_new ();
     *  gtk_about_dialog_set_translator_credits (GTK_ABOUT_DIALOG (about),
     *                                           _("translator-credits"));
     * }</pre>
     * <p>
     * It is a good idea to use the customary {@code msgid} “translator-credits”
     * for this purpose, since translators will already know the purpose of
     * that {@code msgid}, and since {@code GtkAboutDialog} will detect if “translator-credits”
     * is untranslated and omit translator credits.
     */
    public void setTranslatorCredits(java.lang.String translatorCredits) {
        gtk_h.gtk_about_dialog_set_translator_credits(handle(), Interop.allocateNativeString(translatorCredits).handle());
    }
    
    /**
     * Sets the version string to display in the about dialog.
     */
    public void setVersion(java.lang.String version) {
        gtk_h.gtk_about_dialog_set_version(handle(), Interop.allocateNativeString(version).handle());
    }
    
    /**
     * Sets the URL to use for the website link.
     */
    public void setWebsite(java.lang.String website) {
        gtk_h.gtk_about_dialog_set_website(handle(), Interop.allocateNativeString(website).handle());
    }
    
    /**
     * Sets the label to be used for the website link.
     */
    public void setWebsiteLabel(java.lang.String websiteLabel) {
        gtk_h.gtk_about_dialog_set_website_label(handle(), Interop.allocateNativeString(websiteLabel).handle());
    }
    
    /**
     * Sets whether the license text in the about dialog should be
     * automatically wrapped.
     */
    public void setWrapLicense(boolean wrapLicense) {
        gtk_h.gtk_about_dialog_set_wrap_license(handle(), wrapLicense ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
        boolean signalReceived(AboutDialog source, java.lang.String uri);
    }
    
    /**
     * Emitted every time a URL is activated.
     * <p>
     * Applications may connect to it to override the default behaviour,
     * which is to call {@link Gtk#showUri}.
     */
    public SignalHandle onActivateLink(ActivateLinkHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate-link").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AboutDialog.class, "__signalAboutDialogActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalAboutDialogActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AboutDialog.ActivateLinkHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new AboutDialog(References.get(source)), uri.getUtf8String(0));
    }
    
}
