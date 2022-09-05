package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkAboutDialog` offers a simple way to display information about
 * a program.
 * 
 * The shown information includes the programs' logo, name, copyright,
 * website and license. It is also possible to give credits to the authors,
 * documenters, translators and artists who have worked on the program.
 * 
 * An about dialog is typically opened when the user selects the `About`
 * option from the `Help` menu. All parts of the dialog are optional.
 * 
 * ![An example GtkAboutDialog](aboutdialog.png)
 * 
 * About dialogs often contain links and email addresses. `GtkAboutDialog`
 * displays these as clickable links. By default, it calls [func@Gtk.show_uri]
 * when a user clicks one. The behaviour can be overridden with the
 * [signal@Gtk.AboutDialog::activate-link] signal.
 * 
 * To specify a person with an email address, use a string like
 * `Edgar Allan Poe <edgar@poe.com>`. To specify a website with a title,
 * use a string like `GTK team https://www.gtk.org`.
 * 
 * To make constructing a `GtkAboutDialog` as convenient as possible, you can
 * use the function [func@Gtk.show_about_dialog] which constructs and shows
 * a dialog and keeps it around so that it can be shown again.
 * 
 * Note that GTK sets a default title of `_("About %s")` on the dialog
 * window (where `%s` is replaced by the name of the application, but in
 * order to ensure proper translation of the title, applications should
 * set the title property explicitly when constructing a `GtkAboutDialog`,
 * as shown in the following example:
 * 
 * ```c
 * GFile *logo_file = g_file_new_for_path ("./logo.png");
 * GdkTexture *example_logo = gdk_texture_new_from_file (logo_file, NULL);
 * g_object_unref (logo_file);
 * 
 * gtk_show_about_dialog (NULL,
 *                        "program-name", "ExampleCode",
 *                        "logo", example_logo,
 *                        "title", _("About ExampleCode"),
 *                        NULL);
 * ```
 * 
 * ## CSS nodes
 * 
 * `GtkAboutDialog` has a single CSS node with the name `window` and style
 * class `.aboutdialog`.
 */
public class AboutDialog extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public AboutDialog(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to AboutDialog */
    public static AboutDialog castFrom(org.gtk.gobject.Object gobject) {
        return new AboutDialog(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkAboutDialog`.
     */
    public AboutDialog() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_new(), false));
    }
    
    /**
     * Creates a new section in the "Credits" page.
     */
    public void addCreditSection(java.lang.String sectionName, java.lang.String[] people) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_add_credit_section(HANDLE(), Interop.getAllocator().allocateUtf8String(sectionName), Interop.allocateNativeArray(people));
    }
    
    /**
     * Returns the comments string.
     */
    public java.lang.String getComments() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_comments(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the copyright string.
     */
    public java.lang.String getCopyright() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_copyright(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the license information.
     */
    public java.lang.String getLicense() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_license(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the license type.
     */
    public License getLicenseType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_license_type(HANDLE());
        return License.fromValue(RESULT);
    }
    
    /**
     * Returns the paintable displayed as logo in the about dialog.
     */
    public org.gtk.gdk.Paintable getLogo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_logo(HANDLE());
        return new org.gtk.gdk.Paintable.PaintableImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the icon name displayed as logo in the about dialog.
     */
    public java.lang.String getLogoIconName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_logo_icon_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the program name displayed in the about dialog.
     */
    public java.lang.String getProgramName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_program_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the system information that is shown in the about dialog.
     */
    public java.lang.String getSystemInformation() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_system_information(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the translator credits string which is displayed
     * in the credits page.
     */
    public java.lang.String getTranslatorCredits() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_translator_credits(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the version string.
     */
    public java.lang.String getVersion() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_version(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the website URL.
     */
    public java.lang.String getWebsite() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_website(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the label used for the website link.
     */
    public java.lang.String getWebsiteLabel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_website_label(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the license text in the about dialog is
     * automatically wrapped.
     */
    public boolean getWrapLicense() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_get_wrap_license(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the names of the artists to be displayed
     * in the "Credits" page.
     */
    public void setArtists(java.lang.String[] artists) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_artists(HANDLE(), Interop.allocateNativeArray(artists));
    }
    
    /**
     * Sets the names of the authors which are displayed
     * in the "Credits" page of the about dialog.
     */
    public void setAuthors(java.lang.String[] authors) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_authors(HANDLE(), Interop.allocateNativeArray(authors));
    }
    
    /**
     * Sets the comments string to display in the about dialog.
     * 
     * This should be a short string of one or two lines.
     */
    public void setComments(java.lang.String comments) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_comments(HANDLE(), Interop.getAllocator().allocateUtf8String(comments));
    }
    
    /**
     * Sets the copyright string to display in the about dialog.
     * 
     * This should be a short string of one or two lines.
     */
    public void setCopyright(java.lang.String copyright) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_copyright(HANDLE(), Interop.getAllocator().allocateUtf8String(copyright));
    }
    
    /**
     * Sets the names of the documenters which are displayed
     * in the "Credits" page.
     */
    public void setDocumenters(java.lang.String[] documenters) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_documenters(HANDLE(), Interop.allocateNativeArray(documenters));
    }
    
    /**
     * Sets the license information to be displayed in the
     * about dialog.
     * 
     * If `license` is `NULL`, the license page is hidden.
     */
    public void setLicense(java.lang.String license) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_license(HANDLE(), Interop.getAllocator().allocateUtf8String(license));
    }
    
    /**
     * Sets the license of the application showing the about dialog from a
     * list of known licenses.
     * 
     * This function overrides the license set using
     * [method@Gtk.AboutDialog.set_license].
     */
    public void setLicenseType(License licenseType) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_license_type(HANDLE(), licenseType.getValue());
    }
    
    /**
     * Sets the logo in the about dialog.
     */
    public void setLogo(org.gtk.gdk.Paintable logo) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_logo(HANDLE(), logo.HANDLE());
    }
    
    /**
     * Sets the icon name to be displayed as logo in the about dialog.
     */
    public void setLogoIconName(java.lang.String iconName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_logo_icon_name(HANDLE(), Interop.getAllocator().allocateUtf8String(iconName));
    }
    
    /**
     * Sets the name to display in the about dialog.
     * 
     * If `name` is not set, the string returned
     * by `g_get_application_name()` is used.
     */
    public void setProgramName(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_program_name(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
    }
    
    /**
     * Sets the system information to be displayed in the about
     * dialog.
     * 
     * If `system_information` is `NULL`, the system information
     * page is hidden.
     * 
     * See [property@Gtk.AboutDialog:system-information].
     */
    public void setSystemInformation(java.lang.String systemInformation) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_system_information(HANDLE(), Interop.getAllocator().allocateUtf8String(systemInformation));
    }
    
    /**
     * Sets the translator credits string which is displayed in
     * the credits page.
     * 
     * The intended use for this string is to display the translator
     * of the language which is currently used in the user interface.
     * Using `gettext()`, a simple way to achieve that is to mark the
     * string for translation:
     * 
     * ```c
     * GtkWidget *about = gtk_about_dialog_new ();
     *  gtk_about_dialog_set_translator_credits (GTK_ABOUT_DIALOG (about),
     *                                           _("translator-credits"));
     * ```
     * 
     * It is a good idea to use the customary `msgid` “translator-credits”
     * for this purpose, since translators will already know the purpose of
     * that `msgid`, and since `GtkAboutDialog` will detect if “translator-credits”
     * is untranslated and omit translator credits.
     */
    public void setTranslatorCredits(java.lang.String translatorCredits) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_translator_credits(HANDLE(), Interop.getAllocator().allocateUtf8String(translatorCredits));
    }
    
    /**
     * Sets the version string to display in the about dialog.
     */
    public void setVersion(java.lang.String version) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_version(HANDLE(), Interop.getAllocator().allocateUtf8String(version));
    }
    
    /**
     * Sets the URL to use for the website link.
     */
    public void setWebsite(java.lang.String website) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_website(HANDLE(), Interop.getAllocator().allocateUtf8String(website));
    }
    
    /**
     * Sets the label to be used for the website link.
     */
    public void setWebsiteLabel(java.lang.String websiteLabel) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_website_label(HANDLE(), Interop.getAllocator().allocateUtf8String(websiteLabel));
    }
    
    /**
     * Sets whether the license text in the about dialog should be
     * automatically wrapped.
     */
    public void setWrapLicense(boolean wrapLicense) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_about_dialog_set_wrap_license(HANDLE(), wrapLicense ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
        boolean signalReceived(AboutDialog source, java.lang.String uri);
    }
    
    /**
     * Emitted every time a URL is activated.
     * 
     * Applications may connect to it to override the default behaviour,
     * which is to call [func@Gtk.show_uri].
     */
    public void onActivateLink(ActivateLinkHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAboutDialogActivateLink", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate-link"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
