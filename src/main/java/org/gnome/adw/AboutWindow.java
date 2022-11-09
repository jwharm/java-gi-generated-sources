package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A window showing information about the application.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="about-window-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="about-window.png" alt="about-window"&gt;
 * &lt;/picture&gt;
 * <p>
 * An about window is typically opened when the user activates the {@code About …}
 * item in the application's primary menu. All parts of the window are optional.
 * <p>
 * <strong>Main page</strong><br/>
 * {@code AdwAboutWindow} prominently displays the application's icon, name, developer
 * name and version. They can be set with the {@code AboutWindow:application-icon},
 * {@code AboutWindow:application-name},
 * {@code AboutWindow:developer-name] and [property@AboutWindow:version}
 * respectively.
 * <p>
 * <strong>What's New</strong><br/>
 * {@code AdwAboutWindow} provides a way for applications to display their release
 * notes, set with the {@code AboutWindow:release-notes} property.
 * <p>
 * Release notes are formatted the same way as
 * <a href="https://freedesktop.org/software/appstream/docs/chap-Metadata.html#tag-description">AppStream descriptions</a>.
 * <p>
 * The supported formatting options are:
 * <p>
 * * Paragraph ({@code <p>})
 * * Ordered list ({@code <ol>}), with list items ({@code <li>})
 * * Unordered list ({@code <ul>}), with list items ({@code <li>})
 * <p>
 * Within paragraphs and list items, emphasis ({@code <em>}) and inline code
 * ({@code <code>}) text styles are supported. The emphasis is rendered in italic,
 * while inline code is shown in a monospaced font.
 * <p>
 * Any text outside paragraphs or list items is ignored.
 * <p>
 * Nested lists are not supported.
 * <p>
 * Only one version can be shown at a time. By default, the displayed version
 * number matches {@code AboutWindow:version}. Use
 * {@code AboutWindow:release-notes-version} to override it.
 * <p>
 * <strong>Details</strong><br/>
 * The Details page displays the application comments and links.
 * <p>
 * The comments can be set with the {@code AboutWindow:comments} property.
 * Unlike {@code Gtk.AboutDialog:comments}, this string can be long and
 * detailed. It can also contain links and Pango markup.
 * <p>
 * To set the application website, use {@code AboutWindow:website}.
 * To add extra links below the website, use {@code AboutWindow#addLink}.
 * <p>
 * If the Details page doesn't have any other content besides website, the
 * website will be displayed on the main page instead.
 * <p>
 * <strong>Troubleshooting</strong><br/>
 * {@code AdwAboutWindow} displays the following two links on the main page:
 * <p>
 * * Support Questions, set with the {@code AboutWindow:support-url} property,
 * * Report an Issue, set with the {@code AboutWindow:issue-url} property.
 * <p>
 * Additionally, applications can provide debugging information. It will be
 * shown separately on the Troubleshooting page. Use the
 * {@code AboutWindow:debug-info} property to specify it.
 * <p>
 * It's intended to be attached to issue reports when reporting issues against
 * the application. As such, it cannot contain markup or links.
 * <p>
 * {@code AdwAboutWindow} provides a quick way to save debug information to a file.
 * When saving, {@code AboutWindow:debug-info-filename} would be used as
 * the suggested filename.
 * <p>
 * <strong>Credits and Acknowledgements</strong><br/>
 * The Credits page has the following default sections:
 * <p>
 * * Developers, set with the {@code AboutWindow:developers} property,
 * * Designers, set with the {@code AboutWindow:designers} property,
 * * Artists, set with the {@code AboutWindow:artists} property,
 * * Documenters, set with the {@code AboutWindow:documenters} property,
 * * Translators, set with the {@code AboutWindow:translator-credits} property.
 * <p>
 * When setting translator credits, use the strings {@code "translator-credits"} or
 * {@code "translator_credits"} and mark them as translatable.
 * <p>
 * The default sections that don't contain any names won't be displayed.
 * <p>
 * The Credits page can also contain an arbitrary number of extra sections below
 * the default ones. Use {@code AboutWindow#addCreditSection} to add them.
 * <p>
 * The Acknowledgements page can be used to acknowledge additional people and
 * organizations for their non-development contributions. Use
 * {@code AboutWindow#addAcknowledgementSection} to add sections to it. For
 * example, it can be used to list backers in a crowdfunded project or to give
 * special thanks.
 * <p>
 * Each of the people or organizations can have an email address or a website
 * specified. To add a email address, use a string like
 * {@code Edgar Allan Poe <edgar@poe.com>}. To specify a website with a title, use a
 * string like {@code The GNOME Project https://www.gnome.org}:
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="about-window-credits-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="about-window-credits.png" alt="about-window-credits"&gt;
 * &lt;/picture&gt;
 * <p>
 * <strong>Legal</strong><br/>
 * The Legal page displays the copyright and licensing information for the
 * application and other modules.
 * <p>
 * The copyright string is set with the {@code AboutWindow:copyright}
 * property and should be a short string of one or two lines, for example:
 * {@code © 2022 Example}.
 * <p>
 * Licensing information can be quickly set from a list of known licenses with
 * the {@code AboutWindow:license-type} property. If the application's
 * license is not in the list, {@code AboutWindow:license} can be used
 * instead.
 * <p>
 * To add information about other modules, such as application dependencies or
 * data, use {@code AboutWindow#addLegalSection}.
 * <p>
 * <strong>Constructing</strong><br/>
 * To make constructing an {@code AdwAboutWindow} as convenient as possible, you can
 * use the function {@link Adw#showAboutWindow} which constructs and shows a
 * window.
 * <pre>{@code c
 * static void
 * show_about (GtkApplication *app)
 * {
 *   const char *developers[] = {
 *     "Angela Avery",
 *     NULL
 *   };
 * 
 *   const char *designers[] = {
 *     "GNOME Design Team",
 *     NULL
 *   };
 * 
 *   adw_show_about_window (gtk_application_get_active_window (app),
 *                          "application-name", _("Example"),
 *                          "application-icon", "org.example.App",
 *                          "version", "1.2.3",
 *                          "copyright", "© 2022 Angela Avery",
 *                          "issue-url", "https://gitlab.gnome.org/example/example/-/issues/new",
 *                          "license-type", GTK_LICENSE_GPL_3_0,
 *                          "developers", developers,
 *                          "designers", designers,
 *                          "translator-credits", _("translator-credits"),
 *                          NULL);
 * }
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwAboutWindow} has a main CSS node with the name {@code window} and the
 * style class {@code .about}.
 * @version 1.2
 */
public class AboutWindow extends org.gnome.adw.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwAboutWindow";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AboutWindow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AboutWindow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to AboutWindow if its GType is a (or inherits from) "AdwAboutWindow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "AboutWindow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwAboutWindow", a ClassCastException will be thrown.
     */
    public static AboutWindow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwAboutWindow"))) {
            return new AboutWindow(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwAboutWindow");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwAboutWindow}.
     */
    public AboutWindow() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a section to the Acknowledgements page.
     * <p>
     * This can be used to acknowledge additional people and organizations for their
     * non-development contributions - for example, backers in a crowdfunded
     * project.
     * <p>
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     * <p>
     * See also:
     * <p>
     * * {@code AboutWindow:developers}
     * * {@code AboutWindow:designers}
     * * {@code AboutWindow:artists}
     * * {@code AboutWindow:documenters}
     * * {@code AboutWindow:translator-credits}
     * * {@code AboutWindow#addCreditSection}
     * @param name the section name
     * @param people the list of names
     */
    public void addAcknowledgementSection(@Nullable java.lang.String name, @NotNull java.lang.String[] people) {
        java.util.Objects.requireNonNull(people, "Parameter 'people' must not be null");
        try {
            DowncallHandles.adw_about_window_add_acknowledgement_section.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    Interop.allocateNativeArray(people, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds an extra section to the Credits page.
     * <p>
     * Extra sections are displayed below the standard categories.
     * <p>
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     * <p>
     * See also:
     * <p>
     * * {@code AboutWindow:developers}
     * * {@code AboutWindow:designers}
     * * {@code AboutWindow:artists}
     * * {@code AboutWindow:documenters}
     * * {@code AboutWindow:translator-credits}
     * * {@code AboutWindow#addAcknowledgementSection}
     * @param name the section name
     * @param people the list of names
     */
    public void addCreditSection(@Nullable java.lang.String name, @NotNull java.lang.String[] people) {
        java.util.Objects.requireNonNull(people, "Parameter 'people' must not be null");
        try {
            DowncallHandles.adw_about_window_add_credit_section.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    Interop.allocateNativeArray(people, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds an extra section to the Legal page.
     * <p>
     * Extra sections will be displayed below the application's own information.
     * <p>
     * The parameters {@code copyright}, {@code license_type} and {@code license} will be used to present
     * the it the same way as {@code AboutWindow:copyright},
     * {@code AboutWindow:license-type] and [property@AboutWindow:license} are
     * for the application's own information.
     * <p>
     * See those properties for more details.
     * <p>
     * This can be useful to attribute the application dependencies or data.
     * <p>
     * Examples:
     * <pre>{@code c
     * adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     *                                     _("Copyright and a known license"),
     *                                     "© 2022 Example",
     *                                     GTK_LICENSE_LGPL_2_1,
     *                                     NULL);
     * 
     * adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     *                                     _("Copyright and custom license"),
     *                                     "© 2022 Example",
     *                                     GTK_LICENSE_CUSTOM,
     *                                     "Custom license text");
     * 
     * adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     *                                     _("Copyright only"),
     *                                     "© 2022 Example",
     *                                     GTK_LICENSE_UNKNOWN,
     *                                     NULL);
     * 
     * adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     *                                     _("Custom license only"),
     *                                     NULL,
     *                                     GTK_LICENSE_CUSTOM,
     *                                     "Something completely custom here.");
     * }</pre>
     * @param title the name of the section
     * @param copyright a copyright string
     * @param licenseType the type of license
     * @param license custom license information
     */
    public void addLegalSection(@NotNull java.lang.String title, @Nullable java.lang.String copyright, @NotNull org.gtk.gtk.License licenseType, @Nullable java.lang.String license) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        java.util.Objects.requireNonNull(licenseType, "Parameter 'licenseType' must not be null");
        try {
            DowncallHandles.adw_about_window_add_legal_section.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title),
                    (Addressable) (copyright == null ? MemoryAddress.NULL : Interop.allocateNativeString(copyright)),
                    licenseType.getValue(),
                    (Addressable) (license == null ? MemoryAddress.NULL : Interop.allocateNativeString(license)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds an extra link to the Details page.
     * <p>
     * Extra links are displayed under the comment and website.
     * <p>
     * Underlines in {@code title} will be interpreted as indicating a mnemonic.
     * <p>
     * See {@code AboutWindow:website}.
     * @param title the link title
     * @param url the link URL
     */
    public void addLink(@NotNull java.lang.String title, @NotNull java.lang.String url) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        java.util.Objects.requireNonNull(url, "Parameter 'url' must not be null");
        try {
            DowncallHandles.adw_about_window_add_link.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title),
                    Interop.allocateNativeString(url));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the name of the application icon for {@code self}.
     * @return the application icon name
     */
    public @NotNull java.lang.String getApplicationIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_application_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the application name for {@code self}.
     * @return the application name
     */
    public @NotNull java.lang.String getApplicationName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_application_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the list of artists of the application.
     * @return The list of artists
     */
    public @Nullable PointerString getArtists() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_artists.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the comments about the application.
     * @return the comments
     */
    public @NotNull java.lang.String getComments() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_comments.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the copyright information for {@code self}.
     * @return the copyright information
     */
    public @NotNull java.lang.String getCopyright() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_copyright.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the debug information for {@code self}.
     * @return the debug information
     */
    public @NotNull java.lang.String getDebugInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_debug_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the debug information filename for {@code self}.
     * @return the debug information filename
     */
    public @NotNull java.lang.String getDebugInfoFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_debug_info_filename.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the list of designers of the application.
     * @return The list of designers
     */
    public @Nullable PointerString getDesigners() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_designers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the developer name for {@code self}.
     * @return the developer_name
     */
    public @NotNull java.lang.String getDeveloperName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_developer_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the list of developers of the application.
     * @return The list of developers
     */
    public @Nullable PointerString getDevelopers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_developers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the list of documenters of the application.
     * @return The list of documenters
     */
    public @Nullable PointerString getDocumenters() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_documenters.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the issue tracker URL for {@code self}.
     * @return the issue tracker URL
     */
    public @NotNull java.lang.String getIssueUrl() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_issue_url.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the license for {@code self}.
     * @return the license
     */
    public @NotNull java.lang.String getLicense() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_license.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the license type for {@code self}.
     * @return the license type
     */
    public @NotNull org.gtk.gtk.License getLicenseType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_about_window_get_license_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.License(RESULT);
    }
    
    /**
     * Gets the release notes for {@code self}.
     * @return the release notes
     */
    public @NotNull java.lang.String getReleaseNotes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_release_notes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the version described by the application's release notes.
     * @return the release notes version
     */
    public @NotNull java.lang.String getReleaseNotesVersion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_release_notes_version.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the URL of the support page for {@code self}.
     * @return the support page URL
     */
    public @NotNull java.lang.String getSupportUrl() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_support_url.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the translator credits string.
     * @return The translator credits string
     */
    public @NotNull java.lang.String getTranslatorCredits() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_translator_credits.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the version for {@code self}.
     * @return the version
     */
    public @NotNull java.lang.String getVersion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_version.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the application website URL for {@code self}.
     * @return the website URL
     */
    public @NotNull java.lang.String getWebsite() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_about_window_get_website.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets the name of the application icon for {@code self}.
     * <p>
     * The icon is displayed at the top of the main page.
     * @param applicationIcon the application icon name
     */
    public void setApplicationIcon(@NotNull java.lang.String applicationIcon) {
        java.util.Objects.requireNonNull(applicationIcon, "Parameter 'applicationIcon' must not be null");
        try {
            DowncallHandles.adw_about_window_set_application_icon.invokeExact(
                    handle(),
                    Interop.allocateNativeString(applicationIcon));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the application name for {@code self}.
     * <p>
     * The name is displayed at the top of the main page.
     * @param applicationName the application name
     */
    public void setApplicationName(@NotNull java.lang.String applicationName) {
        java.util.Objects.requireNonNull(applicationName, "Parameter 'applicationName' must not be null");
        try {
            DowncallHandles.adw_about_window_set_application_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(applicationName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the list of artists of the application.
     * <p>
     * It will be displayed on the Credits page.
     * <p>
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     * <p>
     * See also:
     * <p>
     * * {@code AboutWindow:developers}
     * * {@code AboutWindow:designers}
     * * {@code AboutWindow:documenters}
     * * {@code AboutWindow:translator-credits}
     * * {@code AboutWindow#addCreditSection}
     * * {@code AboutWindow#addAcknowledgementSection}
     * @param artists the list of artists
     */
    public void setArtists(@Nullable java.lang.String[] artists) {
        try {
            DowncallHandles.adw_about_window_set_artists.invokeExact(
                    handle(),
                    (Addressable) (artists == null ? MemoryAddress.NULL : Interop.allocateNativeArray(artists, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the comments about the application.
     * <p>
     * Comments will be shown on the Details page, above links.
     * <p>
     * Unlike {@code Gtk.AboutDialog:comments}, this string can be long and
     * detailed. It can also contain links and Pango markup.
     * @param comments the comments
     */
    public void setComments(@NotNull java.lang.String comments) {
        java.util.Objects.requireNonNull(comments, "Parameter 'comments' must not be null");
        try {
            DowncallHandles.adw_about_window_set_comments.invokeExact(
                    handle(),
                    Interop.allocateNativeString(comments));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the copyright information for {@code self}.
     * <p>
     * This should be a short string of one or two lines, for example:
     * {@code © 2022 Example}.
     * <p>
     * The copyright information will be displayed on the Legal page, before the
     * application license.
     * <p>
     * {@code AboutWindow#addLegalSection} can be used to add copyright
     * information for the application dependencies or other components.
     * @param copyright the copyright information
     */
    public void setCopyright(@NotNull java.lang.String copyright) {
        java.util.Objects.requireNonNull(copyright, "Parameter 'copyright' must not be null");
        try {
            DowncallHandles.adw_about_window_set_copyright.invokeExact(
                    handle(),
                    Interop.allocateNativeString(copyright));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the debug information for {@code self}.
     * <p>
     * Debug information will be shown on the Troubleshooting page. It's intended
     * to be attached to issue reports when reporting issues against the
     * application.
     * <p>
     * {@code AdwAboutWindow} provides a quick way to save debug information to a file.
     * When saving, {@code AboutWindow:debug-info-filename} would be used as
     * the suggested filename.
     * <p>
     * Debug information cannot contain markup or links.
     * @param debugInfo the debug information
     */
    public void setDebugInfo(@NotNull java.lang.String debugInfo) {
        java.util.Objects.requireNonNull(debugInfo, "Parameter 'debugInfo' must not be null");
        try {
            DowncallHandles.adw_about_window_set_debug_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(debugInfo));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the debug information filename for {@code self}.
     * <p>
     * It will be used as the suggested filename when saving debug information to a
     * file.
     * <p>
     * See {@code AboutWindow:debug-info}.
     * @param filename the debug info filename
     */
    public void setDebugInfoFilename(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        try {
            DowncallHandles.adw_about_window_set_debug_info_filename.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the list of designers of the application.
     * <p>
     * It will be displayed on the Credits page.
     * <p>
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     * <p>
     * See also:
     * <p>
     * * {@code AboutWindow:developers}
     * * {@code AboutWindow:artists}
     * * {@code AboutWindow:documenters}
     * * {@code AboutWindow:translator-credits}
     * * {@code AboutWindow#addCreditSection}
     * * {@code AboutWindow#addAcknowledgementSection}
     * @param designers the list of designers
     */
    public void setDesigners(@Nullable java.lang.String[] designers) {
        try {
            DowncallHandles.adw_about_window_set_designers.invokeExact(
                    handle(),
                    (Addressable) (designers == null ? MemoryAddress.NULL : Interop.allocateNativeArray(designers, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the developer name for {@code self}.
     * <p>
     * The developer name is displayed on the main page, under the application name.
     * <p>
     * If the application is developed by multiple people, the developer name can be
     * set to values like "AppName team", "AppName developers" or
     * "The AppName project", and the individual contributors can be listed on the
     * Credits page, with {@code AboutWindow:developers} and related properties.
     * @param developerName the developer name
     */
    public void setDeveloperName(@NotNull java.lang.String developerName) {
        java.util.Objects.requireNonNull(developerName, "Parameter 'developerName' must not be null");
        try {
            DowncallHandles.adw_about_window_set_developer_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(developerName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the list of developers of the application.
     * <p>
     * It will be displayed on the Credits page.
     * <p>
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     * <p>
     * See also:
     * <p>
     * * {@code AboutWindow:designers}
     * * {@code AboutWindow:artists}
     * * {@code AboutWindow:documenters}
     * * {@code AboutWindow:translator-credits}
     * * {@code AboutWindow#addCreditSection}
     * * {@code AboutWindow#addAcknowledgementSection}
     * @param developers the list of developers
     */
    public void setDevelopers(@Nullable java.lang.String[] developers) {
        try {
            DowncallHandles.adw_about_window_set_developers.invokeExact(
                    handle(),
                    (Addressable) (developers == null ? MemoryAddress.NULL : Interop.allocateNativeArray(developers, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the list of documenters of the application.
     * <p>
     * It will be displayed on the Credits page.
     * <p>
     * Each name may contain email addresses and URLs, see the introduction for more
     * details.
     * <p>
     * See also:
     * <p>
     * * {@code AboutWindow:developers}
     * * {@code AboutWindow:designers}
     * * {@code AboutWindow:artists}
     * * {@code AboutWindow:translator-credits}
     * * {@code AboutWindow#addCreditSection}
     * * {@code AboutWindow#addAcknowledgementSection}
     * @param documenters the list of documenters
     */
    public void setDocumenters(@Nullable java.lang.String[] documenters) {
        try {
            DowncallHandles.adw_about_window_set_documenters.invokeExact(
                    handle(),
                    (Addressable) (documenters == null ? MemoryAddress.NULL : Interop.allocateNativeArray(documenters, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the issue tracker URL for {@code self}.
     * <p>
     * The issue tracker link is displayed on the main page.
     * @param issueUrl the issue tracker URL
     */
    public void setIssueUrl(@NotNull java.lang.String issueUrl) {
        java.util.Objects.requireNonNull(issueUrl, "Parameter 'issueUrl' must not be null");
        try {
            DowncallHandles.adw_about_window_set_issue_url.invokeExact(
                    handle(),
                    Interop.allocateNativeString(issueUrl));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the license for {@code self}.
     * <p>
     * This can be used to set a custom text for the license if it can't be set via
     * {@code AboutWindow:license-type}.
     * <p>
     * When set, {@code AboutWindow:license-type} will be set to
     * {@code GTK_LICENSE_CUSTOM}.
     * <p>
     * The license text will be displayed on the Legal page, below the copyright
     * information.
     * <p>
     * License text can contain Pango markup and links.
     * <p>
     * {@code AboutWindow#addLegalSection} can be used to add license information
     * for the application dependencies or other components.
     * @param license the license
     */
    public void setLicense(@NotNull java.lang.String license) {
        java.util.Objects.requireNonNull(license, "Parameter 'license' must not be null");
        try {
            DowncallHandles.adw_about_window_set_license.invokeExact(
                    handle(),
                    Interop.allocateNativeString(license));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the license for {@code self} from a list of known licenses.
     * <p>
     * If the application's license is not in the list,
     * {@code AboutWindow:license} can be used instead. The license type will be
     * automatically set to {@code GTK_LICENSE_CUSTOM} in that case.
     * <p>
     * If {@code license_type} is {@code GTK_LICENSE_UNKNOWN}, no information will be displayed.
     * <p>
     * If {@code license_type} is different from {@code GTK_LICENSE_CUSTOM}.
     * {@code AboutWindow:license} will be cleared out.
     * <p>
     * The license description will be displayed on the Legal page, below the
     * copyright information.
     * <p>
     * {@code AboutWindow#addLegalSection} can be used to add license information
     * for the application dependencies or other components.
     * @param licenseType the license type
     */
    public void setLicenseType(@NotNull org.gtk.gtk.License licenseType) {
        java.util.Objects.requireNonNull(licenseType, "Parameter 'licenseType' must not be null");
        try {
            DowncallHandles.adw_about_window_set_license_type.invokeExact(
                    handle(),
                    licenseType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the release notes for {@code self}.
     * <p>
     * Release notes are displayed on the the What's New page.
     * <p>
     * Release notes are formatted the same way as
     * <a href="https://freedesktop.org/software/appstream/docs/chap-Metadata.html#tag-description">AppStream descriptions</a>.
     * <p>
     * The supported formatting options are:
     * <p>
     * * Paragraph ({@code <p>})
     * * Ordered list ({@code <ol>}), with list items ({@code <li>})
     * * Unordered list ({@code <ul>}), with list items ({@code <li>})
     * <p>
     * Within paragraphs and list items, emphasis ({@code <em>}) and inline code
     * ({@code <code>}) text styles are supported. The emphasis is rendered in italic,
     * while inline code is shown in a monospaced font.
     * <p>
     * Any text outside paragraphs or list items is ignored.
     * <p>
     * Nested lists are not supported.
     * <p>
     * {@code AdwAboutWindow} displays the version above the release notes. If set, the
     * {@code AboutWindow:release-notes-version} of the property will be used
     * as the version; otherwise, {@code AboutWindow:version} is used.
     * @param releaseNotes the release notes
     */
    public void setReleaseNotes(@NotNull java.lang.String releaseNotes) {
        java.util.Objects.requireNonNull(releaseNotes, "Parameter 'releaseNotes' must not be null");
        try {
            DowncallHandles.adw_about_window_set_release_notes.invokeExact(
                    handle(),
                    Interop.allocateNativeString(releaseNotes));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the version described by the application's release notes.
     * <p>
     * The release notes version is displayed on the What's New page, above the
     * release notes.
     * <p>
     * If not set, {@code AboutWindow:version} will be used instead.
     * <p>
     * For example, an application with the current version 2.0.2 might want to
     * keep the release notes from 2.0.0, and set the release notes version
     * accordingly.
     * <p>
     * See {@code AboutWindow:release-notes}.
     * @param version the release notes version
     */
    public void setReleaseNotesVersion(@NotNull java.lang.String version) {
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        try {
            DowncallHandles.adw_about_window_set_release_notes_version.invokeExact(
                    handle(),
                    Interop.allocateNativeString(version));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the URL of the support page for {@code self}.
     * <p>
     * The support page link is displayed on the main page.
     * @param supportUrl the support page URL
     */
    public void setSupportUrl(@NotNull java.lang.String supportUrl) {
        java.util.Objects.requireNonNull(supportUrl, "Parameter 'supportUrl' must not be null");
        try {
            DowncallHandles.adw_about_window_set_support_url.invokeExact(
                    handle(),
                    Interop.allocateNativeString(supportUrl));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the translator credits string.
     * <p>
     * It will be displayed on the Credits page.
     * <p>
     * This string should be {@code "translator-credits"} or {@code "translator_credits"} and
     * should be marked as translatable.
     * <p>
     * The string may contain email addresses and URLs, see the introduction for
     * more details.
     * <p>
     * See also:
     * <p>
     * * {@code AboutWindow:developers}
     * * {@code AboutWindow:designers}
     * * {@code AboutWindow:artists}
     * * {@code AboutWindow:documenters}
     * * {@code AboutWindow#addCreditSection}
     * * {@code AboutWindow#addAcknowledgementSection}
     * @param translatorCredits the translator credits
     */
    public void setTranslatorCredits(@NotNull java.lang.String translatorCredits) {
        java.util.Objects.requireNonNull(translatorCredits, "Parameter 'translatorCredits' must not be null");
        try {
            DowncallHandles.adw_about_window_set_translator_credits.invokeExact(
                    handle(),
                    Interop.allocateNativeString(translatorCredits));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the version for {@code self}.
     * <p>
     * The version is displayed on the main page.
     * <p>
     * If {@code AboutWindow:release-notes-version} is not set, the version will
     * also be displayed above the release notes on the What's New page.
     * @param version the version
     */
    public void setVersion(@NotNull java.lang.String version) {
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        try {
            DowncallHandles.adw_about_window_set_version.invokeExact(
                    handle(),
                    Interop.allocateNativeString(version));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the application website URL for {@code self}.
     * <p>
     * Website is displayed on the Details page, below comments, or on the main page
     * if the Details page doesn't have any other content.
     * <p>
     * Applications can add other links below, see {@code AboutWindow#addLink}.
     * @param website the website URL
     */
    public void setWebsite(@NotNull java.lang.String website) {
        java.util.Objects.requireNonNull(website, "Parameter 'website' must not be null");
        try {
            DowncallHandles.adw_about_window_set_website.invokeExact(
                    handle(),
                    Interop.allocateNativeString(website));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateLink {
        boolean signalReceived(AboutWindow source, @NotNull java.lang.String uri);
    }
    
    /**
     * Emitted when a URL is activated.
     * <p>
     * Applications may connect to it to override the default behavior, which is
     * to call {@link org.gtk.gtk.Gtk#showUri}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AboutWindow.ActivateLink> onActivateLink(AboutWindow.ActivateLink handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AboutWindow.Callbacks.class, "signalAboutWindowActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AboutWindow.ActivateLink>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_about_window_new = Interop.downcallHandle(
            "adw_about_window_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_add_acknowledgement_section = Interop.downcallHandle(
            "adw_about_window_add_acknowledgement_section",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_add_credit_section = Interop.downcallHandle(
            "adw_about_window_add_credit_section",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_add_legal_section = Interop.downcallHandle(
            "adw_about_window_add_legal_section",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_add_link = Interop.downcallHandle(
            "adw_about_window_add_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_application_icon = Interop.downcallHandle(
            "adw_about_window_get_application_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_application_name = Interop.downcallHandle(
            "adw_about_window_get_application_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_artists = Interop.downcallHandle(
            "adw_about_window_get_artists",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_comments = Interop.downcallHandle(
            "adw_about_window_get_comments",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_copyright = Interop.downcallHandle(
            "adw_about_window_get_copyright",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_debug_info = Interop.downcallHandle(
            "adw_about_window_get_debug_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_debug_info_filename = Interop.downcallHandle(
            "adw_about_window_get_debug_info_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_designers = Interop.downcallHandle(
            "adw_about_window_get_designers",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_developer_name = Interop.downcallHandle(
            "adw_about_window_get_developer_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_developers = Interop.downcallHandle(
            "adw_about_window_get_developers",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_documenters = Interop.downcallHandle(
            "adw_about_window_get_documenters",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_issue_url = Interop.downcallHandle(
            "adw_about_window_get_issue_url",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_license = Interop.downcallHandle(
            "adw_about_window_get_license",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_license_type = Interop.downcallHandle(
            "adw_about_window_get_license_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_release_notes = Interop.downcallHandle(
            "adw_about_window_get_release_notes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_release_notes_version = Interop.downcallHandle(
            "adw_about_window_get_release_notes_version",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_support_url = Interop.downcallHandle(
            "adw_about_window_get_support_url",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_translator_credits = Interop.downcallHandle(
            "adw_about_window_get_translator_credits",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_version = Interop.downcallHandle(
            "adw_about_window_get_version",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_get_website = Interop.downcallHandle(
            "adw_about_window_get_website",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_application_icon = Interop.downcallHandle(
            "adw_about_window_set_application_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_application_name = Interop.downcallHandle(
            "adw_about_window_set_application_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_artists = Interop.downcallHandle(
            "adw_about_window_set_artists",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_comments = Interop.downcallHandle(
            "adw_about_window_set_comments",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_copyright = Interop.downcallHandle(
            "adw_about_window_set_copyright",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_debug_info = Interop.downcallHandle(
            "adw_about_window_set_debug_info",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_debug_info_filename = Interop.downcallHandle(
            "adw_about_window_set_debug_info_filename",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_designers = Interop.downcallHandle(
            "adw_about_window_set_designers",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_developer_name = Interop.downcallHandle(
            "adw_about_window_set_developer_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_developers = Interop.downcallHandle(
            "adw_about_window_set_developers",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_documenters = Interop.downcallHandle(
            "adw_about_window_set_documenters",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_issue_url = Interop.downcallHandle(
            "adw_about_window_set_issue_url",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_license = Interop.downcallHandle(
            "adw_about_window_set_license",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_license_type = Interop.downcallHandle(
            "adw_about_window_set_license_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_about_window_set_release_notes = Interop.downcallHandle(
            "adw_about_window_set_release_notes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_release_notes_version = Interop.downcallHandle(
            "adw_about_window_set_release_notes_version",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_support_url = Interop.downcallHandle(
            "adw_about_window_set_support_url",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_translator_credits = Interop.downcallHandle(
            "adw_about_window_set_translator_credits",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_version = Interop.downcallHandle(
            "adw_about_window_set_version",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_about_window_set_website = Interop.downcallHandle(
            "adw_about_window_set_website",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalAboutWindowActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AboutWindow.ActivateLink) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new AboutWindow(source, Ownership.UNKNOWN), Interop.getStringFrom(uri));
        }
    }
}
