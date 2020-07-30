package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;

import org.tensorflow.lite.examples.classification.extras.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LandmarkActivityTemp extends AppCompatActivity {

   // private WebView webView;
    private TextView textView;
    private String htmlContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark_temp);

        Toolbar toolbar = findViewById(R.id.temp_bar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        final ImageView profileImage = findViewById(R.id.img_toolbar);
        final AppBarLayout appBarLayout = findViewById(R.id.appBarLayout);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                float range = (float) -appBarLayout.getTotalScrollRange();
                profileImage.setImageAlpha((int) (255 * (1.0f - (float) verticalOffset / range)));
            }
        });


        toolbar.setTitle(temp.best_match_title);

        try {
            htmlContent = getHtmlContent();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // webView = findViewById(R.id.landmark_web_temp);
        textView = findViewById(R.id.textView);
        ProgressBar progressBar = findViewById(R.id.progressBarTemp);
        progressBar.getProgressDrawable().setColorFilter(
                Color.rgb(6,69,173), android.graphics.PorterDuff.Mode.SRC_IN);

        if (toolbar.getTitle().equals("UT Tower")) {
            textView.setText(Html.fromHtml(htmlContent));
            /*webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progressBar.setVisibility(View.VISIBLE);
                    setTitle("Loading...");
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                }
            });
            webView.loadUrl("https://tower.utexas.edu/");*/
        }
        else if (toolbar.getTitle().equals("UT Tower Fountain")){
            textView.setText(Html.fromHtml(htmlContent));

            /*webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progressBar.setVisibility(View.VISIBLE);
                    setTitle("Loading...");
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                }
            });
            webView.loadUrl("https://www.dwrl.utexas.edu/2015/10/14/seeing-past-the-littlefield-fountain/");*/
        }
        else if (toolbar.getTitle().equals("UT Blanton Museum of Art")){
            textView.setText(Html.fromHtml(htmlContent));

           /* webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progressBar.setVisibility(View.VISIBLE);
                    setTitle("Loading...");
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                }
            });
            webView.loadUrl("https://blantonmuseum.org/about/");*/
        }
        else if(toolbar.getTitle().equals("UT McCombs")){
            textView.setText(Html.fromHtml(htmlContent));

            /*webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progressBar.setVisibility(View.VISIBLE);
                    setTitle("Loading...");
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                }
            });
            webView.loadUrl("https://www.mccombs.utexas.edu/");*/
        }
        else {
            textView.setText(Html.fromHtml(htmlContent));

            /*webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progressBar.setVisibility(View.VISIBLE);
                    setTitle("Loading...");
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                }
            });
            webView.loadUrl("https://www.utdallas.edu/visitors/");*/
        }


    }

    private String getHtmlContent() throws IOException {

        StringBuffer stringBuffer = new StringBuffer();
        String htmlText = "\n" +
                "<!doctype html>\n" +
                "<html lang=\"en\" dir=\"ltr\">\n" +
                "<!-- Copyright 2015 The Chromium Authors. All rights reserved.\n" +
                "     Use of this source code is governed by a BSD-style license that can be\n" +
                "     found in the LICENSE file. -->\n" +
                "<head>\n" +
                "  <link rel=\"stylesheet\" href=\"chrome-search://local-ntp/animations.css\"></link>\n" +
                "  <link rel=\"stylesheet\" href=\"chrome-search://local-ntp/local-ntp-common.css\"></link>\n" +
                "  <link rel=\"stylesheet\" href=\"chrome-search://local-ntp/customize.css\"></link>\n" +
                "  <link rel=\"stylesheet\" href=\"chrome-search://local-ntp/doodles.css\"></link>\n" +
                "  <link rel=\"stylesheet\" href=\"chrome-search://local-ntp/local-ntp.css\"></link>\n" +
                "  <link rel=\"stylesheet\" href=\"chrome-search://local-ntp/theme.css\"></link>\n" +
                "  <link rel=\"stylesheet\" href=\"chrome-search://local-ntp/voice.css\"></link>\n" +
                "  \n" +
                "  <meta http-equiv=\"Content-Security-Policy\"\n" +
                "      content=\"object-src 'none';child-src chrome-search://most-visited/ https://*.google.com/ ;script-src 'strict-dynamic' 'sha256-1+GSDjMMklBjZY0QiWq+tGupCvajw4Xbn46ect2mZgM=' 'sha256-2mX1M62Fd0u8q0dQY2mRsK5S1NS9jJuQAvyE8tD0dkQ=' 'sha256-EtIKSV82ixJHE3AzqhoiVbUGKG+Kd8XS0fFToow29o0=' 'sha256-QSyFltV9X3gkyBrg+SMfKvZNXmqPQc6K4B6OYhTuXmw=' 'sha256-4M0jdrILwm/h3mCRbjIF07jAlCbI0ZbyLjQL/9HVhwE=' 'sha256-CbH+xPsBKQxVw5d9blISLDeuMSe1M+dJ4xfArFynIfw=' 'sha256-C9ctze2LhHtwL+fcPVPkmVRYjQgXTGs4xfBAzlQwGWk=' 'sha256-yVmlm9txUAL9c9wAcTXYqdk4zxtPoJO/pyl4aKclgK8=';\">\n" +
                "  <script src=\"chrome-search://local-ntp/assert.js\"\n" +
                "      integrity=\"sha256-2mX1M62Fd0u8q0dQY2mRsK5S1NS9jJuQAvyE8tD0dkQ=\"></script>\n" +
                "  <script src=\"chrome-search://local-ntp/animations.js\"\n" +
                "      integrity=\"sha256-1+GSDjMMklBjZY0QiWq+tGupCvajw4Xbn46ect2mZgM=\"></script>\n" +
                "  <script src=\"chrome-search://local-ntp/config.js\"\n" +
                "      integrity=\"sha256-yVmlm9txUAL9c9wAcTXYqdk4zxtPoJO/pyl4aKclgK8=\"></script>\n" +
                "  <script src=\"chrome-search://local-ntp/customize.js\"\n" +
                "      integrity=\"sha256-EtIKSV82ixJHE3AzqhoiVbUGKG+Kd8XS0fFToow29o0=\"></script>\n" +
                "  <script src=\"chrome-search://local-ntp/doodles.js\"\n" +
                "      integrity=\"sha256-QSyFltV9X3gkyBrg+SMfKvZNXmqPQc6K4B6OYhTuXmw=\"></script>\n" +
                "  <script src=\"chrome-search://local-ntp/local-ntp.js\"\n" +
                "      integrity=\"sha256-4M0jdrILwm/h3mCRbjIF07jAlCbI0ZbyLjQL/9HVhwE=\"></script>\n" +
                "  <script src=\"chrome-search://local-ntp/utils.js\"\n" +
                "      integrity=\"sha256-CbH+xPsBKQxVw5d9blISLDeuMSe1M+dJ4xfArFynIfw=\"></script>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta name=\"google\" value=\"notranslate\">\n" +
                "  <meta name=\"referrer\" content=\"strict-origin\">\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div id=\"custom-bg\"></div>\n" +
                "  <div id=\"custom-bg-preview\"></div>\n" +
                "  <!-- Container for the OneGoogleBar HTML. -->\n" +
                "  <div id=\"one-google\"></div>\n" +
                "\n" +
                "  <div id=\"ntp-contents\">\n" +
                "    <div id=\"logo\">\n" +
                "      <!-- The logo that is displayed in the absence of a doodle. -->\n" +
                "      <div id=\"logo-default\" title=\"Google\"></div>\n" +
                "      <!-- Logo displayed when theme prevents doodles. Doesn't fade. -->\n" +
                "      <div id=\"logo-non-white\" title=\"Google\"></div>\n" +
                "      <!-- A doodle, if any: its link and image. -->\n" +
                "      <div id=\"logo-doodle\">\n" +
                "        <div id=\"logo-doodle-container\">\n" +
                "          <div id=\"logo-doodle-wrapper\">\n" +
                "            <button id=\"logo-doodle-button\">\n" +
                "              <img id=\"logo-doodle-image\" tabindex=\"-1\"></img>\n" +
                "            </button>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <iframe id=\"logo-doodle-iframe\" scrolling=\"no\"></iframe>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"fakebox-container\" >\n" +
                "      <div id=\"fakebox\">\n" +
                "        <div class=\"search-icon\"></div>\n" +
                "        <div id=\"fakebox-text\"></div>\n" +
                "        <input id=\"fakebox-input\" autocomplete=\"off\" tabindex=\"-1\" type=\"url\"\n" +
                "            aria-hidden=\"true\">\n" +
                "        <div id=\"fakebox-cursor\"></div>\n" +
                "        <button id=\"fakebox-microphone\" class=\"microphone-icon\" hidden></button>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"realbox-container\" hidden>\n" +
                "      <div id=\"realbox-input-wrapper\">\n" +
                "        <div id=\"realbox-icon\" data-default-icon=\"search.svg\">\n" +
                "        </div>\n" +
                "        <input id=\"realbox\" type=\"search\" autocomplete=\"off\" spellcheck=\"false\"\n" +
                "            aria-live=\"polite\" autofocus>\n" +
                "        <button id=\"realbox-microphone\" class=\"microphone-icon\" hidden></button>\n" +
                "        <div id=\"realbox-matches\"></div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"user-content\">\n" +
                "      <!-- Search suggestions will be inserted here. -->\n" +
                "      <div id=\"most-visited\">\n" +
                "        <!-- The container for the tiles. The MV iframe goes in here. -->\n" +
                "        <div id=\"mv-tiles\"></div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <!-- Notification shown when the tiles are modified. -->\n" +
                "    <div id=\"mv-notice-container\">\n" +
                "      <div id=\"mv-notice\" class=\"notice-hide\" role=\"alert\">\n" +
                "        <span id=\"mv-msg\"></span>\n" +
                "        <!-- Links in the notification. -->\n" +
                "        <span id=\"mv-notice-links\">\n" +
                "          <span id=\"mv-undo\" class=\"ripple\" tabindex=\"0\" role=\"button\"></span>\n" +
                "          <span id=\"mv-restore\" class=\"ripple\" tabindex=\"0\" role=\"button\"></span>\n" +
                "        </span>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"attribution\"><div id=\"attribution-text\"></div></div>\n" +
                "\n" +
                "    <div id=\"error-notice-container\">\n" +
                "      <div id=\"error-notice\" class=\"notice-hide\" role=\"alert\">\n" +
                "        <span id=\"error-notice-icon\"></span>\n" +
                "        <span id=\"error-notice-msg\"></span>\n" +
                "        <span id=\"error-notice-link\" class=\"ripple\" tabindex=\"0\" role=\"button\"></span>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"edit-bg\" tabindex=\"0\" role=\"button\" hidden>\n" +
                "      <div id=\"edit-bg-icon\"></div>\n" +
                "      <span id=\"edit-bg-text\">Customize</span>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"custom-bg-attr\"></div>\n" +
                "  </div>\n" +
                "\n" +
                "  <dialog div id=\"edit-bg-dialog\">\n" +
                "    <div id=\"edit-bg-menu\">\n" +
                "      <div id=\"edit-bg-title\"></div>\n" +
                "      <div id=\"edit-bg-default-wallpapers\" class=\"bg-option\" tabindex=\"0\">\n" +
                "        <div class=\"bg-option-img\"></div>\n" +
                "        <div id=\"edit-bg-default-wallpapers-text\" class=\"bg-option-text\">\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div id=\"edit-bg-upload-image\" class=\"bg-option\" tabindex=\"0\">\n" +
                "        <div class=\"bg-option-img\"></div>\n" +
                "        <div id=\"edit-bg-upload-image-text\" class=\"bg-option-text\"></div>\n" +
                "      </div>\n" +
                "      <div id=\"edit-bg-divider\"></div>\n" +
                "      <div id=\"custom-links-restore-default\" class=\"bg-option bg-option-disabled\" tabindex=\"0\">\n" +
                "        <div class=\"bg-option-img\"></div>\n" +
                "        <div id=\"custom-links-restore-default-text\" class=\"bg-option-text\"></div>\n" +
                "      </div>\n" +
                "      <div id=\"edit-bg-restore-default\" class=\"bg-option bg-option-disabled\" tabindex=\"0\">\n" +
                "        <div class=\"bg-option-img\"></div>\n" +
                "        <div id=\"edit-bg-restore-default-text\" class=\"bg-option-text\"></div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </dialog>\n" +
                "\n" +
                "  <dialog id=\"ddlsd\">\n" +
                "    <div id=\"ddlsd-title\"></div>\n" +
                "    <button id=\"ddlsd-close\"></button>\n" +
                "    <div id=\"ddlsd-content\">\n" +
                "      <button id=\"ddlsd-fbb\" class=\"ddlsd-sbtn\"></button>\n" +
                "      <button id=\"ddlsd-twb\" class=\"ddlsd-sbtn\"></button>\n" +
                "      <button id=\"ddlsd-emb\" class=\"ddlsd-sbtn\"></button>\n" +
                "      <hr id=\"ddlsd-hr\">\n" +
                "      <div id=\"ddlsd-link\">\n" +
                "        <span id=\"ddlsd-text-ctr\">\n" +
                "          <input type=\"text\" id=\"ddlsd-text\" dir=\"ltr\">\n" +
                "        </span>\n" +
                "        <button id=\"ddlsd-copy\"></button>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </dialog>\n" +
                "\n" +
                "  <dialog id=\"bg-sel-menu\" class=\"customize-dialog\">\n" +
                "    <div id=\"bg-sel-title-bar\">\n" +
                "    <div id=\"bg-sel-back-circle\" tabindex=\"0\" role=\"button\">\n" +
                "      <div id=\"bg-sel-back\"></div>\n" +
                "    </div>\n" +
                "    <div id=\"bg-sel-title\"></div>\n" +
                "    </div>\n" +
                "    <div id=\"bg-sel-tiles\" tabindex=\"0\"></div>\n" +
                "    <div id=\"bg-sel-footer\">\n" +
                "      <button id=\"bg-sel-footer-cancel\" class=\"bg-sel-footer-button paper secondary ripple\"\n" +
                "          tabindex=\"0\"></button>\n" +
                "      <button id=\"bg-sel-footer-done\" class=\"bg-sel-footer-button paper primary ripple\"\n" +
                "          tabindex=\"-1\"></button>\n" +
                "    </div>\n" +
                "  </dialog>\n" +
                "\n" +
                "  <dialog id=\"customization-menu\" class=\"customize-dialog\">\n" +
                "    <div id=\"menu-nav-panel\" role=\"tablist\" aria-label=\"Customize this page\">\n" +
                "      <button id=\"backgrounds-button\" class=\"menu-option\" tabindex=\"0\"\n" +
                "          role=\"tab\" aria-controls=\"backgrounds-menu backgrounds-image-menu\"\n" +
                "          aria-selected=\"true\" aria-labelledby=\"backgrounds-menu-option\"\n" +
                "          title=\"Background\">\n" +
                "        <div class=\"menu-option-icon-wrapper\">\n" +
                "          <div id=\"backgrounds-icon\" class=\"menu-option-icon\"></div>\n" +
                "        </div>\n" +
                "        <div id=\"backgrounds-menu-option\" class=\"menu-option-label\">\n" +
                "          Background\n" +
                "        </div>\n" +
                "      </button>\n" +
                "      <button id=\"shortcuts-button\" class=\"menu-option\" tabindex=\"0\" role=\"tab\"\n" +
                "          aria-controls=\"shortcuts-menu\" aria-selected=\"false\"\n" +
                "          aria-labelledby=\"shortcuts-menu-option\"\n" +
                "          title=\"Shortcuts\">\n" +
                "        <div class=\"menu-option-icon-wrapper\">\n" +
                "          <div id=\"shortcuts-icon\" class=\"menu-option-icon\"></div>\n" +
                "        </div>\n" +
                "        <div id=\"shortcuts-menu-option\" class=\"menu-option-label\">\n" +
                "          Shortcuts\n" +
                "        </div>\n" +
                "      </button>\n" +
                "      <button id=\"colors-button\" class=\"menu-option\" tabindex=\"0\" role=\"tab\"\n" +
                "          aria-controls=\"colors-menu\" aria-selected=\"false\"\n" +
                "          aria-labelledby=\"colors-menu-option\" title=\"Color and theme\">\n" +
                "        <div class=\"menu-option-icon-wrapper\">\n" +
                "          <div id=\"colors-icon\" class=\"menu-option-icon\"></div>\n" +
                "        </div>\n" +
                "        <div id=\"colors-menu-option\" class=\"menu-option-label\">\n" +
                "          Color and theme\n" +
                "        </div>\n" +
                "      </button>\n" +
                "    </div>\n" +
                "    <div id=\"menu-contents\">\n" +
                "      <div id=\"menu-header\">\n" +
                "        <div id=\"menu-back-circle\" tabindex=\"0\" role=\"button\"\n" +
                "            aria-label=\"Back\" title=\"Back\">\n" +
                "          <div id=\"menu-back\"></div>\n" +
                "        </div>\n" +
                "        <div id=\"menu-title\">Customize this page</div>\n" +
                "        <div id=\"refresh-daily-wrapper\">\n" +
                "          <div id=\"refresh-toggle-wrapper\" title=\"Refresh daily\">\n" +
                "            <label class=\"switch\">\n" +
                "              <input id=\"refresh-daily-toggle\" type=\"checkbox\"\n" +
                "                  aria-labelledby=\"refresh-text\"></input>\n" +
                "              <span class=\"toggle\">\n" +
                "                <div class=\"knob\"></div>\n" +
                "                <div class=\"highlight\"></div>\n" +
                "              </span>\n" +
                "            </label>\n" +
                "          </div>\n" +
                "          <div id=\"refresh-text\">Refresh daily</div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div id=\"backgrounds-menu\" class=\"menu-panel\" tabindex=\"0\"\n" +
                "          role=\"tabpanel\" aria-label=\"Background\">\n" +
                "        <div id=\"backgrounds-upload\" class=\"bg-sel-tile-bg\">\n" +
                "          <div id=\"backgrounds-upload-icon\" class=\"bg-sel-tile\" tabindex=\"-1\"\n" +
                "              role=\"button\" aria-label=\"Upload from device\"\n" +
                "              aria-pressed=\"false\" title=\"Upload from device\">\n" +
                "            <div id=\"backgrounds-upload-arrow\"></div>\n" +
                "            <div id=\"backgrounds-upload-text\">Upload from device</div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <div id=\"backgrounds-default\" class=\"bg-sel-tile-bg\">\n" +
                "          <div id=\"backgrounds-default-icon\" class=\"bg-sel-tile\" tabindex=\"-1\"\n" +
                "              role=\"button\" aria-label=\"No background\"\n" +
                "              title=\"No background\" aria-pressed=\"false\">\n" +
                "            <div class=\"mini-page\">\n" +
                "              <div class=\"mini-header-colorful\"></div>\n" +
                "              <div class=\"mini-shortcuts\"></div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"bg-sel-tile-title\">No background</div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div id=\"backgrounds-image-menu\" class=\"menu-panel\" tabindex=\"0\"\n" +
                "          role=\"tabpanel\" aria-label=\"Background\"></div>\n" +
                "      <div id=\"backgrounds-disabled-menu\" class=\"menu-panel\" tabindex=\"0\"\n" +
                "          role=\"tabpanel\" aria-label=\"Background\">\n" +
                "        <div id=\"backgrounds-disabled-wrapper\">\n" +
                "          <div id=\"backgrounds-disabled-icon\"></div>\n" +
                "          <div id=\"backgrounds-disabled-title\">\n" +
                "            Custom backgrounds have been turned off by your administrator\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div id=\"shortcuts-menu\" class=\"menu-panel\" tabindex=\"0\" role=\"tabpanel\"\n" +
                "          aria-label=\"Shortcuts\">\n" +
                "        <div id=\"sh-options\">\n" +
                "          <div class=\"sh-option\">\n" +
                "            <div id=\"sh-option-cl\" class=\"sh-option-image\" tabindex=\"-1\"\n" +
                "                role=\"button\" aria-pressed=\"false\"\n" +
                "                aria-labelledby=\"sh-option-cl-title\" title=\"My shortcuts\">\n" +
                "              <div class=\"sh-option-icon\"></div>\n" +
                "              <div class=\"sh-option-mini\">\n" +
                "                <div class=\"mini-page\">\n" +
                "                  <div class=\"mini-header\"></div>\n" +
                "                  <div class=\"mini-shortcuts\"></div>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div id=\"sh-option-cl-title\" class=\"sh-option-title\">\n" +
                "              My shortcuts\n" +
                "            </div>\n" +
                "            Shortcuts are curated by you\n" +
                "          </div>\n" +
                "          <div class=\"sh-option\">\n" +
                "            <div id=\"sh-option-mv\" class=\"sh-option-image\" tabindex=\"-1\"\n" +
                "                role=\"button\" aria-pressed=\"false\"\n" +
                "                aria-labelledby=\"sh-option-mv-title\" title=\"Most visited sites\">\n" +
                "              <div class=\"sh-option-icon\"></div>\n" +
                "              <div class=\"sh-option-mini\">\n" +
                "                <div class=\"mini-page\">\n" +
                "                  <div class=\"mini-header\"></div>\n" +
                "                  <div class=\"mini-shortcuts\"></div>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div id=\"sh-option-mv-title\" class=\"sh-option-title\">\n" +
                "              Most visited sites\n" +
                "            </div>\n" +
                "            Shortcuts are suggested based on websites you visit often\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <div id=\"sh-hide\">\n" +
                "          <div id=\"sh-hide-icon\"></div>\n" +
                "          <div>\n" +
                "            <div id=\"sh-hide-title\">Hide shortcuts</div>\n" +
                "            Don&#39;t show shortcuts on this page\n" +
                "          </div>\n" +
                "          <div id=\"sh-hide-toggle-wrapper\" title=\"Hide shortcuts\">\n" +
                "            <label class=\"switch\">\n" +
                "              <input id=\"sh-hide-toggle\" type=\"checkbox\" tabindex=\"-1\"\n" +
                "                  aria-labelledby=\"sh-hide-title\"></input>\n" +
                "              <span class=\"toggle\">\n" +
                "                <div class=\"knob\"></div>\n" +
                "                <div class=\"highlight\"></div>\n" +
                "              </span>\n" +
                "            </label>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div id=\"colors-menu\" class=\"menu-panel\" tabindex=\"0\" role=\"tabpanel\"\n" +
                "          aria-label=\"Color and theme\">\n" +
                "        <div id=\"colors-theme\" tabindex=\"0\">\n" +
                "            <div id=\"colors-theme-icon\"></div>\n" +
                "            <div id=\"colors-theme-info\">\n" +
                "              <div id=\"colors-theme-name\"></div>\n" +
                "              Current theme you have installed\n" +
                "            </div>\n" +
                "            <a id=\"colors-theme-link\" target=\"_blank\">\n" +
                "              <div id=\"colors-theme-link-icon\" > </div>\n" +
                "            </a>\n" +
                "            <button id=\"colors-theme-uninstall\" class=\"paper secondary\">\n" +
                "              Uninstall\n" +
                "            </button>\n" +
                "        </div>\n" +
                "        <div id=\"color-picker-container\" class=\"bg-sel-tile-bg\">\n" +
                "          <div id=\"color-picker-tile\" class=\"bg-sel-tile\" tabindex=\"-1\"\n" +
                "            aria-label=\"Select color\"\n" +
                "            title=\"Select color\"\n" +
                "            role=\"button\" aria-pressed=\"false\">\n" +
                "            <div id=\"left-semicircle\"></div>\n" +
                "            <div id=\"color-picker-icon\"></div>\n" +
                "            <input id=\"color-picker\" type=\"color\" style=\"display:none\">\n" +
                "            </input>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <div id=\"colors-default\" class=\"bg-sel-tile-bg\">\n" +
                "          <div id=\"colors-default-icon\" class=\"bg-sel-tile\" tabindex=\"-1\"\n" +
                "              aria-label=\"Default\"\n" +
                "              title=\"Default\" tabindex=\"-1\"\n" +
                "              role=\"button\" aria-pressed=\"false\">\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div id=\"menu-footer\">\n" +
                "      <button id=\"menu-cancel\"\n" +
                "          class=\"bg-sel-footer-button paper secondary ripple\"\n" +
                "          title=\"Cancel\">Cancel</button>\n" +
                "      <button id=\"menu-done\" class=\"bg-sel-footer-button paper primary ripple\"\n" +
                "          title=\"Done\">Done</button>\n" +
                "    </div>\n" +
                "  </dialog>\n" +
                "\n" +
                "  <dialog id=\"voice-overlay-dialog\" class=\"overlay-dialog\">\n" +
                "    <div id=\"voice-overlay\" class=\"overlay-hidden\">\n" +
                "      <button id=\"voice-close-button\" class=\"close-button\">&times;</button>\n" +
                "      <div id=\"voice-outer\" class=\"outer\">\n" +
                "        <div class=\"inner-container\">\n" +
                "          <div id=\"voice-button-container\" class=\"button-container\">\n" +
                "            <!-- The audio level animation. -->\n" +
                "            <span id=\"voice-level\" class=\"level\"></span>\n" +
                "            <!-- The microphone button. -->\n" +
                "            <span id=\"voice-button\" class=\"button\">\n" +
                "              <!-- The microphone icon (in CSS). -->\n" +
                "              <div class=\"microphone\">\n" +
                "                <span class=\"receiver\"></span>\n" +
                "                <div class=\"wrapper\">\n" +
                "                  <span class=\"stem\"></span>\n" +
                "                  <span class=\"shell\"></span>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </span>\n" +
                "          </div>\n" +
                "          <div id=\"text-container\" aria-live=\"polite\">\n" +
                "            <!-- Low confidence text underneath high confidence text. -->\n" +
                "            <span id=\"voice-text-i\" class=\"voice-text\"></span>\n" +
                "            <!-- High confidence text on top of low confidence text. -->\n" +
                "            <span id=\"voice-text-f\" class=\"voice-text\"></span>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </dialog>\n" +
                "  <div id=\"screen-reader-announcer\" role=\"status\" aria-live=\"polite\"></div>\n" +
                "\n" +
                "  <div id=\"one-google-end-of-body\"></div>\n" +
                "\n" +
                "  <script defer src=\"chrome-search://local-ntp/voice.js\"\n" +
                "      integrity=\"sha256-C9ctze2LhHtwL+fcPVPkmVRYjQgXTGs4xfBAzlQwGWk=\"></script>\n" +
                "</body>\n" +
                "</html>\n";

        stringBuffer.append(htmlText);
        return stringBuffer.toString();
    }

    @Override
    public void onBackPressed(){
        /*if(webView.canGoBack()){
            webView.goBack();
        }else{
            Intent intent = new Intent(LandmarkActivityTemp.this, ClassifierActivity.class);
            startActivity(intent);
            finish();
        }*/
    }
}
