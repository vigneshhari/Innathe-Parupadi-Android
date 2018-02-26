package com.merclain.innathe_parupadi;

/**
 * Created by root on 1/30/18.
 */

public class CSS {
    public static String CSS = "<style>@import url(//fonts.googleapis.com/css?family=Merriweather:400,700,400italic,700italic|Open+Sans:400,300,800);@charset \"UTF-8\";\n" +

            "@keyframes spinner {\n" +
            "  to {\n" +
            "    transform: rotate(360deg); } }\n" +
            "\n" +
            "@-webkit-keyframes spinner {\n" +
            "  to {\n" +
            "    -webkit-transform: rotate(360deg); } }\n" +
            "\n" +
            ".dante--spinner {\n" +
            "  min-width: 24px;\n" +
            "  min-height: 24px; }\n" +
            "\n" +
            ".dante--spinner:before {\n" +
            "  content: 'Loading\\2026';\n" +
            "  position: absolute;\n" +
            "  top: 50%;\n" +
            "  left: 50%;\n" +
            "  width: 16px;\n" +
            "  height: 16px;\n" +
            "  margin-top: -10px;\n" +
            "  margin-left: -10px; }\n" +
            "\n" +
            ".dante--spinner:not(:required):before {\n" +
            "  content: '';\n" +
            "  border-radius: 50%;\n" +
            "  border: 2px solid rgba(0, 0, 0, 0.3);\n" +
            "  border-top-color: rgba(0, 0, 0, 0.6);\n" +
            "  animation: spinner .6s linear infinite;\n" +
            "  -webkit-animation: spinner .6s linear infinite; }\n" +
            "\n" +
            ".hidden {\n" +
            "  display: none !important; }\n" +
            "\n" +
            ".notesSource {\n" +
            "  padding: 0;\n" +
            "  margin: 0;\n" +
            "  position: relative;\n" +
            "  color: rgba(0, 0, 0, 0.8);\n" +
            "  text-rendering: optimizeLegibility;\n" +
            "  -webkit-font-smoothing: antialiased;\n" +
            "  -moz-osx-font-smoothing: grayscale;\n" +
            "  -moz-font-feature-settings: liga on; }\n" +
            "\n" +
            ".notesSource *,\n" +
            ".notesSource *:before,\n" +
            ".notesSource *:after {\n" +
            "  box-sizing: border-box; }\n" +
            "\n" +
            ".dante-paste {\n" +
            "  display: none; }\n" +
            "\n" +
            "@font-face {\n" +
            "  font-family: \"dante\";\n" +
            "  src: url(fonts/fontello.eot);\n" +
            "  src: url(fonts/fontello.eot?#iefix) format(\"embedded-opentype\"), url(fonts/fontello.woff) format(\"woff\"), url(fonts/fontello.ttf) format(\"truetype\"), url(fonts/fontello.svg#fontello) format(\"svg\");\n" +
            "  font-weight: normal;\n" +
            "  font-style: normal; }\n" +
            "\n" +
            "@font-face {\n" +
            "  font-family: \"dante-tooltip\";\n" +
            "  src: url(fonts/dante.eot);\n" +
            "  src: url(fonts/dante.eot?#iefix) format(\"embedded-opentype\"), url(fonts/dante.woff) format(\"woff\"), url(fonts/dante.ttf) format(\"truetype\"), url(fonts/dante.svg#dante) format(\"svg\");\n" +
            "  font-weight: normal;\n" +
            "  font-style: normal; }\n" +
            "\n" +
            "@-webkit-keyframes pop-upwards {\n" +
            "  0% {\n" +
            "    -webkit-transform: matrix(0.97, 0, 0, 1, 0, 12);\n" +
            "    transform: matrix(0.97, 0, 0, 1, 0, 12);\n" +
            "    opacity: 0; }\n" +
            "  20% {\n" +
            "    -webkit-transform: matrix(0.99, 0, 0, 1, 0, 2);\n" +
            "    transform: matrix(0.99, 0, 0, 1, 0, 2);\n" +
            "    opacity: .7; }\n" +
            "  40% {\n" +
            "    -webkit-transform: matrix(1, 0, 0, 1, 0, -1);\n" +
            "    transform: matrix(1, 0, 0, 1, 0, -1);\n" +
            "    opacity: 1; }\n" +
            "  70% {\n" +
            "    -webkit-transform: matrix(1, 0, 0, 1, 0, 0);\n" +
            "    transform: matrix(1, 0, 0, 1, 0, 0);\n" +
            "    opacity: 1; }\n" +
            "  100% {\n" +
            "    -webkit-transform: matrix(1, 0, 0, 1, 0, 0);\n" +
            "    transform: matrix(1, 0, 0, 1, 0, 0);\n" +
            "    opacity: 1; } }\n" +
            "\n" +
            "@keyframes pop-upward {\n" +
            "  0% {\n" +
            "    -webkit-transform: matrix(0.97, 0, 0, 1, 0, 12);\n" +
            "    transform: matrix(0.97, 0, 0, 1, 0, 12);\n" +
            "    opacity: 0; }\n" +
            "  20% {\n" +
            "    -webkit-transform: matrix(0.99, 0, 0, 1, 0, 2);\n" +
            "    transform: matrix(0.99, 0, 0, 1, 0, 2);\n" +
            "    opacity: .7; }\n" +
            "  40% {\n" +
            "    -webkit-transform: matrix(1, 0, 0, 1, 0, -1);\n" +
            "    transform: matrix(1, 0, 0, 1, 0, -1);\n" +
            "    opacity: 1; }\n" +
            "  70% {\n" +
            "    -webkit-transform: matrix(1, 0, 0, 1, 0, 0);\n" +
            "    transform: matrix(1, 0, 0, 1, 0, 0);\n" +
            "    opacity: 1; }\n" +
            "  100% {\n" +
            "    -webkit-transform: matrix(1, 0, 0, 1, 0, 0);\n" +
            "    transform: matrix(1, 0, 0, 1, 0, 0);\n" +
            "    opacity: 1; } }\n" +
            "\n" +
            ".postArticle {\n" +
            "  position: relative;\n" +
            "  -webkit-transform: translateZ(0);\n" +
            "  transform: translateZ(0); }\n" +
            "  .postArticle .layoutSingleColumn {\n" +
            "    width: 700px;\n" +
            "    margin-left: auto;\n" +
            "    margin-right: auto; }\n" +
            "  @media (max-width: 800px) {\n" +
            "    .postArticle .layoutSingleColumn {\n" +
            "      width: 640px; } }\n" +
            "  @media (max-width: 680px) {\n" +
            "    .postArticle .layoutSingleColumn {\n" +
            "      width: auto;\n" +
            "      margin-left: 20px;\n" +
            "      margin-right: 20px; } }\n" +
            "\n" +
            ".postWrapper,\n" +
            ".postWrapper-inner {\n" +
            "  position: relative;\n" +
            "  *zoom: 1; }\n" +
            "  .postWrapper:before, .postWrapper:after,\n" +
            "  .postWrapper-inner:before,\n" +
            "  .postWrapper-inner:after {\n" +
            "    content: \" \";\n" +
            "    display: table; }\n" +
            "  .postWrapper:after,\n" +
            "  .postWrapper-inner:after {\n" +
            "    clear: both; }\n" +
            "\n" +
            ".postWrapper {\n" +
            "  overflow: hidden; }\n" +
            "  .is-postEditMode .postWrapper {\n" +
            "    display: none; }\n" +
            "  .is-postEditModeInitialized .postWrapper {\n" +
            "    display: block; }\n" +
            "\n" +
            ".postContent {\n" +
            "  font-family: \"freight-text-pro\", \"Merriweather\", Georgia, Cambria, \"Times New Roman\", Times, serif;\n" +
            "  letter-spacing: 0.01rem;\n" +
            "  font-weight: 400;\n" +
            "  font-style: normal;\n" +
            "  font-size: 18px;\n" +
            "  line-height: 1.9; }\n" +
            "\n" +
            ".postField, .postField:focus {\n" +
            "  outline: 0;\n" +
            "  word-break: break-word;\n" +
            "  word-wrap: break-word; }\n" +
            "\n" +
            ".postField--body {\n" +
            "  *zoom: 1;\n" +
            "  margin-bottom: 30px; }\n" +
            "  .postField--body:before, .postField--body:after {\n" +
            "    content: \" \";\n" +
            "    display: table; }\n" +
            "  .postField--body:after {\n" +
            "    clear: both; }\n" +
            "\n" +
            ".section--last {\n" +
            "  padding-bottom: 5px; }\n" +
            "\n" +
            ".section-content {\n" +
            "  *zoom: 1; }\n" +
            "  .section-content:before, .section-content:after {\n" +
            "    content: \" \";\n" +
            "    display: table; }\n" +
            "  .section-content:after {\n" +
            "    clear: both; }\n" +
            "\n" +
            ".section-inner {\n" +
            "  position: relative; }\n" +
            "\n" +
            ".dante-icon:before {\n" +
            "  display: inline-block;\n" +
            "  font-family: \"dante\";\n" +
            "  font-style: normal;\n" +
            "  font-variant: normal;\n" +
            "  font-weight: normal;\n" +
            "  line-height: 1em;\n" +
            "  text-align: center;\n" +
            "  text-decoration: inherit;\n" +
            "  text-transform: none; }\n" +
            "\n" +
            ".dante-icon-h2:before {\n" +
            "  content: \"H1\"; }\n" +
            "\n" +
            ".dante-icon-h3:before {\n" +
            "  content: \"H2\"; }\n" +
            "\n" +
            ".dante-icon-h4:before {\n" +
            "  content: \"H3\"; }\n" +
            "\n" +
            ".dante-icon-p:before {\n" +
            "  content: \"P\"; }\n" +
            "\n" +
            ".dante-icon-code:before {\n" +
            "  content: \"\\E816\"; }\n" +
            "\n" +
            ".dante-icon-insertorderedlist:before {\n" +
            "  content: \"\\E803\"; }\n" +
            "\n" +
            ".dante-icon-insertunorderedlist:before {\n" +
            "  content: \"\\E802\"; }\n" +
            "\n" +
            ".dante-icon-inserthorizontalrule:before {\n" +
            "  content: \"\\E818\"; }\n" +
            "\n" +
            ".dante-icon-indent:before {\n" +
            "  content: \"\\E801\"; }\n" +
            "\n" +
            ".dante-icon-outdent:before {\n" +
            "  content: \"\\E800\"; }\n" +
            "\n" +
            ".dante-icon-bold:before {\n" +
            "  content: \"\\E805\"; }\n" +
            "\n" +
            ".dante-icon-italic:before {\n" +
            "  content: \"\\E806\"; }\n" +
            "\n" +
            ".dante-icon-underline:before {\n" +
            "  content: \"\\E804\"; }\n" +
            "\n" +
            ".dante-icon-createlink:before {\n" +
            "  content: \"\\E810\"; }\n" +
            "\n" +
            ".dante-icon-blockquote:before {\n" +
            "  content: \"\\E814\"; }\n" +
            "\n" +
            ".dante-icon-h2:before,\n" +
            ".dante-icon-h3:before,\n" +
            ".dante-icon-h4:before {\n" +
            "  font-weight: bold; }\n" +
            "\n" +
            ".tooltip-icon:before {\n" +
            "  font-family: 'dante-tooltip';\n" +
            "  speak: none;\n" +
            "  font-style: normal;\n" +
            "  font-weight: normal;\n" +
            "  font-variant: normal;\n" +
            "  text-transform: none;\n" +
            "  line-height: 1;\n" +
            "  -webkit-font-smoothing: antialiased;\n" +
            "  -moz-osx-font-smoothing: grayscale; }\n" +
            "\n" +
            ".dante-icon-divider:before {\n" +
            "  content: \"\\E904\"; }\n" +
            "\n" +
            ".dante-icon-image-center:before {\n" +
            "  content: \"\\E900\"; }\n" +
            "\n" +
            ".dante-icon-image-fill:before {\n" +
            "  content: \"\\E901\"; }\n" +
            "\n" +
            ".dante-icon-image-left:before {\n" +
            "  content: \"\\E902\"; }\n" +
            "\n" +
            ".dante-icon-image-wide:before {\n" +
            "  content: \"\\E903\"; }\n" +
            "\n" +
            ".dante-icon-video:before {\n" +
            "  content: \"\\E600\"; }\n" +
            "\n" +
            ".dante-icon-image:before {\n" +
            "  content: \"\\E601\"; }\n" +
            "\n" +
            ".dante-icon-plus:before {\n" +
            "  content: \"\\E602\"; }\n" +
            "\n" +
            ".dante-icon-embed:before {\n" +
            "  content: \"\\E603\"; }\n" +
            "\n" +
            ".dante-menu {\n" +
            "  position: absolute;\n" +
            "  visibility: hidden;\n" +
            "  z-index: 1000;\n" +
            "  -webkit-transition: none;\n" +
            "  transition: none;\n" +
            "  display: none;\n" +
            "  top: 0;\n" +
            "  left: 0;\n" +
            "  display: block;\n" +
            "  white-space: nowrap;\n" +
            "  height: 42px;\n" +
            "  background: #333333;\n" +
            "  color: #FFFFFF;\n" +
            "  border: 0px;\n" +
            "  border-radius: 5px;\n" +
            "  box-shadow: 1px 2px 3px -2px #222; }\n" +
            "  .dante-menu:after {\n" +
            "    content: \"\";\n" +
            "    height: 0;\n" +
            "    width: 0;\n" +
            "    position: absolute;\n" +
            "    left: 50%;\n" +
            "    pointer-events: none;\n" +
            "    border: 8px solid transparent;\n" +
            "    margin-left: -4px; }\n" +
            "  .dante-menu:after {\n" +
            "    border-top-color: #333333;\n" +
            "    bottom: -15px; }\n" +
            "\n" +
            ".dante-menu--active {\n" +
            "  display: inline-block;\n" +
            "  visibility: visible;\n" +
            "  -webkit-animation: pop-upwards 180ms forwards linear;\n" +
            "  animation: pop-upwards 180ms forwards linear; }\n" +
            "\n" +
            ".dante-menu--linkmode .dante-menu-buttons {\n" +
            "  visibility: hidden; }\n" +
            "\n" +
            ".dante-menu--linkmode .dante-menu-linkinput {\n" +
            "  display: block; }\n" +
            "\n" +
            ".dante-menu--linkmode .dante-menu-input {\n" +
            "  -webkit-animation: pop-upwards 180ms forwards linear;\n" +
            "  animation: pop-upwards 180ms forwards linear; }\n" +
            "\n" +
            ".dante-menu-buttons {\n" +
            "  list-style: none;\n" +
            "  margin: 0;\n" +
            "  padding: 0;\n" +
            "  line-height: 0; }\n" +
            "\n" +
            ".dante-menu-divider {\n" +
            "  width: 1px;\n" +
            "  height: 24px;\n" +
            "  margin: 9px 2px;\n" +
            "  background: rgba(255, 255, 255, 0.2);\n" +
            "  display: inline-block;\n" +
            "  overflow: hidden;\n" +
            "  cursor: default;\n" +
            "  line-height: 42px;\n" +
            "  -webkit-user-select: none;\n" +
            "  -moz-user-select: none;\n" +
            "  -ms-user-select: none;\n" +
            "  user-select: none; }\n" +
            "\n" +
            ".dante-menu-button {\n" +
            "  min-width: 20px;\n" +
            "  display: inline-block;\n" +
            "  padding-left: 10px;\n" +
            "  padding-right: 10px;\n" +
            "  overflow: hidden;\n" +
            "  text-align: center;\n" +
            "  color: #FFFFFF;\n" +
            "  cursor: pointer;\n" +
            "  font-size: 16px;\n" +
            "  line-height: 42px;\n" +
            "  -webkit-user-select: none;\n" +
            "  -moz-user-select: none;\n" +
            "  -ms-user-select: none;\n" +
            "  user-select: none; }\n" +
            "\n" +
            ".dante-menu-button.active {\n" +
            "  color: #5BD974; }\n" +
            "\n" +
            ".dante-menu-button:first-child {\n" +
            "  border-top-left-radius: 5px;\n" +
            "  border-bottom-left-radius: 5px;\n" +
            "  padding-left: 18px; }\n" +
            "\n" +
            ".dante-menu-button:last-child {\n" +
            "  border-top-right-radius: 5px;\n" +
            "  border-bottom-right-radius: 5px;\n" +
            "  padding-right: 18px; }\n" +
            "\n" +
            ".dante-menu-button--disabled {\n" +
            "  -webkit-user-select: none !important;\n" +
            "  -moz-user-select: none !important;\n" +
            "  -ms-user-select: none !important;\n" +
            "  user-select: none !important;\n" +
            "  opacity: .3; }\n" +
            "\n" +
            ".dante-menu-linkinput {\n" +
            "  display: none;\n" +
            "  position: absolute;\n" +
            "  top: 0;\n" +
            "  left: 0;\n" +
            "  right: 0;\n" +
            "  bottom: 0; }\n" +
            "\n" +
            ".dante-menu-linkinput .dante-menu-button {\n" +
            "  position: absolute;\n" +
            "  top: 0;\n" +
            "  right: 0; }\n" +
            "\n" +
            ".dante-menu-input {\n" +
            "  position: absolute;\n" +
            "  top: 0;\n" +
            "  left: 0;\n" +
            "  background: transparent;\n" +
            "  width: 100%;\n" +
            "  padding: 13px 40px 13px 10px;\n" +
            "  color: #FFFFFF;\n" +
            "  border: none;\n" +
            "  outline: none;\n" +
            "  font-size: 14px;\n" +
            "  box-sizing: border-box;\n" +
            "  border-radius: 5px;\n" +
            "  appearance: none;\n" +
            "  text-align: left;\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  letter-spacing: 0.01rem;\n" +
            "  font-weight: 400;\n" +
            "  font-style: normal;\n" +
            "  text-rendering: optimizeLegibility;\n" +
            "  -webkit-font-smoothing: antialiased;\n" +
            "  -moz-osx-font-smoothing: grayscale;\n" +
            "  -moz-font-feature-settings: \"liga\" on; }\n" +
            "\n" +
            ".inlineTooltip {\n" +
            "  position: absolute;\n" +
            "  z-index: 900;\n" +
            "  width: 32px;\n" +
            "  height: 32px;\n" +
            "  -webkit-transition: opacity 100ms, width 0 linear 250ms;\n" +
            "  transition: opacity 100ms, width 0 linear 250ms;\n" +
            "  padding: 0;\n" +
            "  font-size: 0;\n" +
            "  opacity: 0;\n" +
            "  pointer-events: none; }\n" +
            "  .inlineTooltip.is-active {\n" +
            "    opacity: 1;\n" +
            "    pointer-events: auto; }\n" +
            "  .inlineTooltip.is-scaled {\n" +
            "    -webkit-transition-delay: 0;\n" +
            "    transition-delay: 0;\n" +
            "    width: auto; }\n" +
            "\n" +
            ".inlineTooltip-menu {\n" +
            "  display: inline-block;\n" +
            "  margin-left: 54px; }\n" +
            "\n" +
            ".inlineTooltip-button {\n" +
            "  background-color: white;\n" +
            "  float: left;\n" +
            "  margin-right: 9px;\n" +
            "  display: inline-block;\n" +
            "  position: relative;\n" +
            "  outline: 0;\n" +
            "  padding: 0;\n" +
            "  vertical-align: bottom;\n" +
            "  box-sizing: border-box;\n" +
            "  border-radius: 999em;\n" +
            "  cursor: pointer;\n" +
            "  font-size: 14px;\n" +
            "  text-decoration: none;\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  letter-spacing: -0.02em;\n" +
            "  font-weight: 400;\n" +
            "  font-style: normal;\n" +
            "  white-space: nowrap;\n" +
            "  text-rendering: auto;\n" +
            "  text-align: center;\n" +
            "  text-rendering: optimizeLegibility;\n" +
            "  -webkit-font-smoothing: antialiased;\n" +
            "  -moz-osx-font-smoothing: grayscale;\n" +
            "  -moz-font-feature-settings: \"liga\" on;\n" +
            "  width: 32px;\n" +
            "  height: 32px;\n" +
            "  line-height: 32px;\n" +
            "  -webkit-transition: 100ms border-color, 100ms color;\n" +
            "  transition: 100ms border-color, 100ms color;\n" +
            "  border: 1px solid;\n" +
            "  border-color: rgba(0, 0, 0, 0.44);\n" +
            "  color: rgba(0, 0, 0, 0.44); }\n" +
            "\n" +
            ".inlineTooltip-button:hover {\n" +
            "  border-color: rgba(0, 0, 0, 0.9);\n" +
            "  color: rgba(0, 0, 0, 0.9); }\n" +
            "\n" +
            ".inlineTooltip-button.scale {\n" +
            "  -webkit-transform: scale(0);\n" +
            "  -ms-transform: scale(0);\n" +
            "  transform: scale(0);\n" +
            "  -webkit-transition: -webkit-transform 100ms, 100ms border-color, 100ms color;\n" +
            "  transition: transform 100ms, 100ms border-color, 100ms color; }\n" +
            "\n" +
            ".is-scaled .inlineTooltip-button.scale {\n" +
            "  -webkit-transform: scale(1);\n" +
            "  -ms-transform: scale(1);\n" +
            "  transform: scale(1);\n" +
            "  -webkit-transition: -webkit-transform 250ms, 100ms border-color, 100ms color;\n" +
            "  transition: transform 250ms, 100ms border-color, 100ms color; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(11) {\n" +
            "  -webkit-transition-delay: 300ms;\n" +
            "  transition-delay: 300ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(10) {\n" +
            "  -webkit-transition-delay: 270ms;\n" +
            "  transition-delay: 270ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(9) {\n" +
            "  -webkit-transition-delay: 240ms;\n" +
            "  transition-delay: 240ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(8) {\n" +
            "  -webkit-transition-delay: 210ms;\n" +
            "  transition-delay: 210ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(7) {\n" +
            "  -webkit-transition-delay: 180ms;\n" +
            "  transition-delay: 180ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(6) {\n" +
            "  -webkit-transition-delay: 150ms;\n" +
            "  transition-delay: 150ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(5) {\n" +
            "  -webkit-transition-delay: 120ms;\n" +
            "  transition-delay: 120ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(4) {\n" +
            "  -webkit-transition-delay: 90ms;\n" +
            "  transition-delay: 90ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(3) {\n" +
            "  -webkit-transition-delay: 60ms;\n" +
            "  transition-delay: 60ms; }\n" +
            "\n" +
            ".inlineTooltip-button.scale:nth-child(2) {\n" +
            "  -webkit-transition-delay: 30ms;\n" +
            "  transition-delay: 30ms; }\n" +
            "\n" +
            ".inlineTooltip-button.control {\n" +
            "  display: block;\n" +
            "  position: absolute;\n" +
            "  margin-right: 22px; }\n" +
            "\n" +
            ".inlineTooltip-button.control {\n" +
            "  -webkit-transition: -webkit-transform 100ms, 100ms border-color, 100ms color;\n" +
            "  transition: transform 100ms, 100ms border-color, 100ms color;\n" +
            "  -webkit-transform: rotate(0);\n" +
            "  -ms-transform: rotate(0);\n" +
            "  transform: rotate(0); }\n" +
            "\n" +
            ".is-scaled .inlineTooltip-button.control {\n" +
            "  -webkit-transition: -webkit-transform 250ms, 100ms border-color, 100ms color;\n" +
            "  transition: transform 250ms, 100ms border-color, 100ms color;\n" +
            "  -webkit-transform: rotate(45deg);\n" +
            "  -ms-transform: rotate(45deg);\n" +
            "  transform: rotate(45deg);\n" +
            "  border-color: rgba(0, 0, 0, 0.9);\n" +
            "  color: rgba(0, 0, 0, 0.9); }\n" +
            "\n" +
            ".dante-popover {\n" +
            "  overflow: hidden;\n" +
            "  position: absolute;\n" +
            "  z-index: 900;\n" +
            "  visibility: visible;\n" +
            "  font-size: 12px;\n" +
            "  text-align: center;\n" +
            "  pointer-events: auto;\n" +
            "  padding: 15px;\n" +
            "  font-family: \"Lucida Grande\",\"Lucida Sans Unicode\",\"Lucida Sans\",Geneva,Verdana,sans-serif;\n" +
            "  letter-spacing: -0.02em;\n" +
            "  font-weight: 400;\n" +
            "  font-style: normal;\n" +
            "  line-height: 1.4;\n" +
            "  opacity: 0; }\n" +
            "\n" +
            ".dante-popover.is-active {\n" +
            "  opacity: 1; }\n" +
            "\n" +
            ".dante-popover .popover-inner {\n" +
            "  background: #fff;\n" +
            "  box-shadow: 0 1px 2px rgba(0, 0, 0, 0.25), 0 0 1px rgba(0, 0, 0, 0.35); }\n" +
            "\n" +
            ".popover.is-active {\n" +
            "  visibility: visible; }\n" +
            "\n" +
            ".popover-inner {\n" +
            "  position: relative;\n" +
            "  max-width: 300px;\n" +
            "  border-radius: 5px;\n" +
            "  padding: 8px; }\n" +
            "\n" +
            ".popover-inner a {\n" +
            "  color: inherit;\n" +
            "  text-decoration: none; }\n" +
            "\n" +
            ".popover--tooltip {\n" +
            "  pointer-events: none; }\n" +
            "\n" +
            ".popover--tooltip .popover-inner {\n" +
            "  background: #333333;\n" +
            "  border-radius: 4px;\n" +
            "  color: #fff; }\n" +
            "\n" +
            ".popover--Linktooltip {\n" +
            "  pointer-events: auto;\n" +
            "  z-index: 300;\n" +
            "  word-break: break-word;\n" +
            "  word-wrap: break-word; }\n" +
            "\n" +
            ".popover--Linktooltip .popover-inner {\n" +
            "  padding: 8px 10px;\n" +
            "  font-size: 12px; }\n" +
            "\n" +
            ".popover--Aligntooltip .popover-inner {\n" +
            "  padding: 0;\n" +
            "  background: #333333;\n" +
            "  color: #fff; }\n" +
            "\n" +
            ".popover--typeahead .popover-inner {\n" +
            "  position: relative;\n" +
            "  padding: 14px;\n" +
            "  border-radius: 4px; }\n" +
            "\n" +
            ".popover--typeahead .popover-inner ul {\n" +
            "  padding-left: 0px; }\n" +
            "\n" +
            ".popover.popover--maxWidth360 .popover-inner {\n" +
            "  max-width: 360px; }\n" +
            "\n" +
            ".popover:not(.popover--flexible) .popover-inner {\n" +
            "  max-width: 280px; }\n" +
            "\n" +
            "/*\n" +
            ".popover.is-withTransition {\n" +
            "  -webkit-transition:opacity 100ms ease;\n" +
            "  transition:opacity 100ms ease;\n" +
            "}\n" +
            "\n" +
            ".is-resizing .popover {\n" +
            "  opacity:0;\n" +
            "  -webkit-transition:opacity 0 ease;\n" +
            "  transition:opacity 0 ease;\n" +
            "}\n" +
            "*/\n" +
            ".popover-arrow {\n" +
            "  position: absolute; }\n" +
            "\n" +
            ".popover-arrow:after {\n" +
            "  background-color: #333333; }\n" +
            "\n" +
            ".popover--top .popover-arrow,\n" +
            ".popover--bottom .popover-arrow {\n" +
            "  left: 50%;\n" +
            "  margin-left: -6px; }\n" +
            "\n" +
            ".popover--left .popover-arrow,\n" +
            ".popover--right .popover-arrow {\n" +
            "  top: 50%;\n" +
            "  margin-top: -6px; }\n" +
            "\n" +
            ".popover--right .popover-arrow {\n" +
            "  left: 1px; }\n" +
            "\n" +
            ".popover--bottom .popover-arrow {\n" +
            "  top: 1px; }\n" +
            "\n" +
            ".popover--left .popover-arrow {\n" +
            "  right: 1px; }\n" +
            "\n" +
            ".popover-arrow:after {\n" +
            "  content: '';\n" +
            "  display: block;\n" +
            "  width: 12px;\n" +
            "  height: 12px; }\n" +
            "\n" +
            ".popover--top .popover-arrow:after {\n" +
            "  -webkit-transform: rotate(45deg) translate(-5px, -5px);\n" +
            "  -ms-transform: rotate(45deg) translate(-5px, -5px);\n" +
            "  transform: rotate(45deg) translate(-5px, -5px);\n" +
            "  box-shadow: 1px 1px 1px -1px #333333; }\n" +
            "\n" +
            ".popover--right .popover-arrow:after {\n" +
            "  -webkit-transform: rotate(45deg) translate(6px, -6px);\n" +
            "  -ms-transform: rotate(45deg) translate(6px, -6px);\n" +
            "  transform: rotate(45deg) translate(6px, -6px);\n" +
            "  box-shadow: -1px 1px 1px -1px #333333; }\n" +
            "\n" +
            ".popover--bottom .popover-arrow:after {\n" +
            "  -webkit-transform: rotate(45deg) translate(6px, 6px);\n" +
            "  -ms-transform: rotate(45deg) translate(6px, 6px);\n" +
            "  transform: rotate(45deg) translate(6px, 6px);\n" +
            "  box-shadow: -1px -1px 1px -1px #333333; }\n" +
            "\n" +
            ".popover--left .popover-arrow:after {\n" +
            "  -webkit-transform: rotate(45deg) translate(-6px, 6px);\n" +
            "  -ms-transform: rotate(45deg) translate(-6px, 6px);\n" +
            "  transform: rotate(45deg) translate(-6px, 6px);\n" +
            "  box-shadow: 1px -1px 1px -1px #333333; }\n" +
            "\n" +
            ".graf--h2,\n" +
            ".graf--h3,\n" +
            ".graf--h4,\n" +
            ".graf--h5,\n" +
            ".graf--h6,\n" +
            ".graf--h7,\n" +
            ".postList,\n" +
            ".graf--figure,\n" +
            ".graf--blockquote,\n" +
            ".graf--pullquote,\n" +
            ".graf--p,\n" +
            ".graf--pre {\n" +
            "  margin: 0; }\n" +
            "\n" +
            ".postList {\n" +
            "  margin-bottom: 30px; }\n" +
            "\n" +
            ".graf--p,\n" +
            ".graf--blockquote,\n" +
            ".graf--pullquote {\n" +
            "  margin-bottom: 30px; }\n" +
            "\n" +
            ".graf--code {\n" +
            "  line-height: 1em; }\n" +
            "\n" +
            ".graf--p.dante--spinner {\n" +
            "  position: relative; }\n" +
            "\n" +
            ".graf--h2 {\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  font-size: 60px;\n" +
            "  font-style: normal;\n" +
            "  font-weight: 700;\n" +
            "  letter-spacing: -0.04em;\n" +
            "  line-height: 1;\n" +
            "  margin-bottom: 8px;\n" +
            "  margin-left: -3px;\n" +
            "  margin-top: 40px;\n" +
            "  padding-top: 0; }\n" +
            "\n" +
            ".graf--h3 {\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  letter-spacing: -0.02em;\n" +
            "  font-weight: 700;\n" +
            "  font-style: normal;\n" +
            "  font-size: 36px;\n" +
            "  margin-left: -1.8px;\n" +
            "  line-height: 1.2;\n" +
            "  margin-top: 40px;\n" +
            "  margin-bottom: 4px; }\n" +
            "\n" +
            ".graf--h4 {\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  letter-spacing: -0.02em;\n" +
            "  font-weight: 300;\n" +
            "  font-style: normal;\n" +
            "  font-size: 30px;\n" +
            "  margin-left: -1.5px;\n" +
            "  line-height: 1.2;\n" +
            "  color: rgba(0, 0, 0, 0.44);\n" +
            "  margin-top: 40px;\n" +
            "  margin-bottom: 2px; }\n" +
            "\n" +
            ".section--first .graf--h2.graf--first,\n" +
            ".section--first .graf--h3.graf--first,\n" +
            ".section--first .graf--h4.graf--first {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "\n" +
            ".graf--h2 + .graf--h2 {\n" +
            "  margin-top: -8px; }\n" +
            "\n" +
            ".graf--h2 + .graf--h3,\n" +
            ".graf--h2 + .graf--h4 {\n" +
            "  margin-top: -6px; }\n" +
            "\n" +
            ".graf--h3 + .graf--h2,\n" +
            ".graf--h4 + .graf--h2 {\n" +
            "  margin-top: 2px; }\n" +
            "\n" +
            ".graf--h3 + .graf--h4,\n" +
            ".graf--h4 + .graf--h3 {\n" +
            "  margin-top: -2px; }\n" +
            "\n" +
            ".graf--h2 + .postList,\n" +
            ".graf--h3 + .postList,\n" +
            ".graf--h4 + .postList {\n" +
            "  margin-top: 10px; }\n" +
            "\n" +
            ".graf--h2 + .graf--p.graf--empty,\n" +
            ".graf--h3 + .graf--p.graf--empty,\n" +
            ".graf--h4 + .graf--p.graf--empty {\n" +
            "  margin-bottom: -7px;\n" +
            "  margin-top: -7px; }\n" +
            "\n" +
            ".graf--h2 + .graf--p.graf--empty + .graf--h2,\n" +
            ".graf--h3 + .graf--p.graf--empty + .graf--h2,\n" +
            ".graf--h4 + .graf--p.graf--empty + .graf--h2 {\n" +
            "  margin-top: -5px; }\n" +
            "\n" +
            ".graf--h2 + .graf--p.graf--empty + .graf--h3,\n" +
            ".graf--h3 + .graf--p.graf--empty + .graf--h3,\n" +
            ".graf--h4 + .graf--p.graf--empty + .graf--h3,\n" +
            ".graf--h2 + .graf--p.graf--empty + .graf--h4,\n" +
            ".graf--h3 + .graf--p.graf--empty + .graf--h4,\n" +
            ".graf--h4 + .graf--p.graf--empty + .graf--h4 {\n" +
            "  margin-top: -8px; }\n" +
            "\n" +
            ".graf--blockquote, blockquote {\n" +
            "  font-family: \"freight-text-pro\", \"Merriweather\", Georgia, Cambria, \"Times New Roman\", Times, serif;\n" +
            "  border-left: 3px solid rgba(0, 0, 0, 0.8);\n" +
            "  font-style: italic;\n" +
            "  font-weight: 400;\n" +
            "  letter-spacing: 0.01rem;\n" +
            "  margin-left: -23px;\n" +
            "  padding-bottom: 3px;\n" +
            "  padding-left: 20px; }\n" +
            "\n" +
            ".graf--blockquote + .graf--blockquote, blockquote + blockquote {\n" +
            "  margin-top: -30px;\n" +
            "  padding-top: 30px; }\n" +
            "\n" +
            ".graf--pullquote {\n" +
            "  line-height: 1.4;\n" +
            "  text-align: center;\n" +
            "  font-size: 32px;\n" +
            "  margin: 48px -160px;\n" +
            "  border: none;\n" +
            "  padding: 0;\n" +
            "  font-family: \"freight-text-pro\", \"Merriweather\", Georgia, Cambria, \"Times New Roman\", Times, serif;\n" +
            "  letter-spacing: 0.01rem;\n" +
            "  font-weight: 400;\n" +
            "  font-style: italic;\n" +
            "  -webkit-transition: margin 100ms;\n" +
            "  transition: margin 100ms; }\n" +
            "\n" +
            ".graf--pre, .public-DraftStyleDefault-pre {\n" +
            "  background: none repeat scroll 0 0 rgba(0, 0, 0, 0.05);\n" +
            "  font-family: Menlo, Monaco, Consolas, \"Courier New\", \"Courier\", monospace;\n" +
            "  font-size: 16px;\n" +
            "  margin-bottom: 20px;\n" +
            "  padding: 20px;\n" +
            "  white-space: pre-wrap; }\n" +
            "\n" +
            ".graf--pre + .graf--pre {\n" +
            "  margin-top: -20px; }\n" +
            "\n" +
            ".graf--figure {\n" +
            "  box-sizing: border-box;\n" +
            "  clear: both;\n" +
            "  margin-bottom: 30px;\n" +
            "  outline: medium none;\n" +
            "  position: relative; }\n" +
            "\n" +
            ".graf--figure.is-mediaFocused .graf-image,\n" +
            ".graf--figure.is-mediaFocused iframe {\n" +
            "  box-shadow: 0 0 0 3px #57ad68; }\n" +
            "\n" +
            ".graf--mixtapeEmbed a {\n" +
            "  text-decoration: none; }\n" +
            "\n" +
            ".graf--h4 + .graf--figure,\n" +
            ".graf--h3 + .graf--figure,\n" +
            ".graf--h2 + .graf--figure {\n" +
            "  margin-top: 15px; }\n" +
            "\n" +
            ".graf--first {\n" +
            "  margin-top: 0;\n" +
            "  padding-top: 0; }\n" +
            "\n" +
            "/*.graf--empty {\n" +
            "  margin-bottom: -7px;\n" +
            "  margin-top: -7px;\n" +
            "}*/\n" +
            "p[data-align=\"center\"],\n" +
            ".graf--h2[data-align=\"center\"],\n" +
            ".graf--h3[data-align=\"center\"],\n" +
            ".graf--h4[data-align=\"center\"],\n" +
            ".graf--blockquote[data-align=\"center\"] {\n" +
            "  text-align: center; }\n" +
            "\n" +
            ".markup--anchor,\n" +
            ".graf--sectionCaption {\n" +
            "  cursor: text; }\n" +
            "\n" +
            ".markup--anchor {\n" +
            "  text-decoration: underline;\n" +
            "  color: inherit; }\n" +
            "\n" +
            "@media (max-width: 500px) {\n" +
            "  .graf--h2 {\n" +
            "    font-size: 36px;\n" +
            "    line-height: 1.1;\n" +
            "    padding-top: 12px;\n" +
            "    margin-bottom: 6px; }\n" +
            "  .graf--h3 {\n" +
            "    font-size: 26px;\n" +
            "    line-height: 1.2;\n" +
            "    margin-top: 18px;\n" +
            "    margin-bottom: 4px; }\n" +
            "  .graf--h4 {\n" +
            "    font-size: 24px;\n" +
            "    line-height: 1.2;\n" +
            "    margin-top: 18px;\n" +
            "    margin-bottom: 2px; } }\n" +
            "\n" +
            ".aspectRatioPlaceholder {\n" +
            "  margin: 0 auto;\n" +
            "  position: relative;\n" +
            "  width: 100%; }\n" +
            "\n" +
            ".is-postEditMode .graf-image:before, .is-postEditMode\n" +
            ".iframeContainer:before {\n" +
            "  bottom: 0;\n" +
            "  content: \"\";\n" +
            "  left: 0;\n" +
            "  position: absolute;\n" +
            "  right: 0;\n" +
            "  top: 0;\n" +
            "  z-index: 500; }\n" +
            "\n" +
            ".aspectRatioPlaceholder.is-locked .graf-image, .aspectRatioPlaceholder.is-locked\n" +
            ".graf-imageAnchor {\n" +
            "  height: 100%;\n" +
            "  left: 0;\n" +
            "  position: absolute;\n" +
            "  top: 0;\n" +
            "  width: 100%; }\n" +
            "\n" +
            ".graf-image,\n" +
            ".graf-imageAnchor,\n" +
            ".iframeContainer > iframe,\n" +
            ".iframeContainer {\n" +
            "  box-sizing: border-box;\n" +
            "  display: block;\n" +
            "  margin: auto;\n" +
            "  max-width: 100%; }\n" +
            "\n" +
            ".imageCaption {\n" +
            "  top: 0;\n" +
            "  text-align: center;\n" +
            "  margin-top: 0;\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  letter-spacing: 0;\n" +
            "  font-weight: 400;\n" +
            "  font-size: 13px;\n" +
            "  line-height: 1.4;\n" +
            "  color: rgba(0, 0, 0, 0.6);\n" +
            "  outline: 0;\n" +
            "  z-index: 300;\n" +
            "  margin-top: 10px;\n" +
            "  position: relative; }\n" +
            "\n" +
            ".imageCaption .danteDefaultPlaceholder {\n" +
            "  margin-bottom: -18px !important;\n" +
            "  display: block; }\n" +
            "\n" +
            "div[contenteditable=\"false\"] .danteDefaultPlaceholder {\n" +
            "  display: none; }\n" +
            "\n" +
            "@media (max-width: 1200px) {\n" +
            "  .imageCaption,\n" +
            "  .postField--outsetCenterImage > .imageCaption {\n" +
            "    position: relative;\n" +
            "    width: 100%;\n" +
            "    text-align: center;\n" +
            "    left: 0;\n" +
            "    margin-top: 10px; } }\n" +
            "\n" +
            "figure.graf--layoutOutsetLeft .imageCaption,\n" +
            "figure.graf--layoutOutsetLeft .postField--outsetCenterImage > .imageCaption {\n" +
            "  position: relative;\n" +
            "  width: 100%;\n" +
            "  text-align: center;\n" +
            "  left: 0;\n" +
            "  margin-top: 10px; }\n" +
            "\n" +
            "figure.is-defaultValue .imageCaption,\n" +
            ".graf--sectionCaption.is-defaultValue {\n" +
            "  display: none; }\n" +
            "\n" +
            ".graf--figure.is-mediaFocused .imageCaption,\n" +
            ".graf--figure.is-defaultValue.is-selected .imageCaption,\n" +
            "section.is-mediaFocused .graf--sectionCaption,\n" +
            ".graf--sectionCaption.is-defaultValue.is-selected {\n" +
            "  display: block; }\n" +
            "\n" +
            ".editable .markup--anchor,\n" +
            ".editable .graf--sectionCaption {\n" +
            "  cursor: text; }\n" +
            "\n" +
            "/*\n" +
            ".markup--anchor {\n" +
            "    background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0) 50%, rgba(0, 0, 0, 0.6) 50%);\n" +
            "    //background-position: 0 24px;\n" +
            "    background-position: 0 19px;\n" +
            "    background-repeat: repeat-x;\n" +
            "    background-size: 2px 2px;\n" +
            "    text-decoration: none;\n" +
            "    color: rgba(0, 0, 0, 1);\n" +
            "    //border-bottom: 1px solid rgba(0,0,0,.4);\n" +
            "}\n" +
            "\n" +
            "h4 .markup--anchor {\n" +
            "    background-position: 0 34px;\n" +
            "}\n" +
            "*/\n" +
            ".is-postEditMode iframe {\n" +
            "  border: 3px solid rgba(255, 255, 255, 0); }\n" +
            "\n" +
            ".graf--mixtapeEmbed {\n" +
            "  border-color: rgba(0, 0, 0, 0.15);\n" +
            "  border-radius: 5px;\n" +
            "  border-style: solid;\n" +
            "  border-width: 1px;\n" +
            "  box-sizing: border-box;\n" +
            "  color: rgba(0, 0, 0, 0.6);\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  font-size: 12px;\n" +
            "  font-style: normal;\n" +
            "  font-weight: 300;\n" +
            "  letter-spacing: -0.02em;\n" +
            "  margin-bottom: 40px;\n" +
            "  margin-top: 40px;\n" +
            "  max-height: 310px;\n" +
            "  max-width: 700px;\n" +
            "  overflow: hidden;\n" +
            "  padding: 30px;\n" +
            "  position: relative; }\n" +
            "\n" +
            ".mixtapeImage {\n" +
            "  background-position: center center;\n" +
            "  background-repeat: no-repeat;\n" +
            "  background-size: cover;\n" +
            "  float: right;\n" +
            "  height: 310px;\n" +
            "  margin: -30px -30px 0 25px;\n" +
            "  width: 310px; }\n" +
            "\n" +
            ".mixtapeImage--empty {\n" +
            "  height: 0;\n" +
            "  width: 0; }\n" +
            "\n" +
            ".graf--mixtapeEmbed {\n" +
            "  color: rgba(0, 0, 0, 0.6);\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  font-size: 12px;\n" +
            "  font-style: normal;\n" +
            "  font-weight: 300;\n" +
            "  letter-spacing: -0.02em; }\n" +
            "\n" +
            ".markup--mixtapeEmbed-strong {\n" +
            "  color: #000;\n" +
            "  display: block;\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  font-size: 30px;\n" +
            "  font-style: normal;\n" +
            "  font-weight: 300;\n" +
            "  letter-spacing: -0.02em;\n" +
            "  line-height: 1.2;\n" +
            "  margin-bottom: 0px; }\n" +
            "\n" +
            ".markup--mixtapeEmbed-em {\n" +
            "  display: block;\n" +
            "  font-size: 16px;\n" +
            "  font-style: normal;\n" +
            "  margin-bottom: 10px;\n" +
            "  max-height: 120px;\n" +
            "  overflow: hidden; }\n" +
            "\n" +
            "/*CAPTION*/\n" +
            ".editor a a {\n" +
            "  color: inherit;\n" +
            "  text-decoration: none; }\n" +
            "\n" +
            ".defaultValue {\n" +
            "  color: rgba(0, 0, 0, 0.3); }\n" +
            "\n" +
            "section:first-child > .section-divider,\n" +
            "section.is-backgrounded + section > .section-divider {\n" +
            "  display: none; }\n" +
            "\n" +
            ".defaultValue--prompt {\n" +
            "  font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "  font-size: 18px;\n" +
            "  font-style: normal;\n" +
            "  font-weight: 400;\n" +
            "  letter-spacing: -0.02em; }\n" +
            "\n" +
            "div[contenteditable=\"false\"] a.markup--anchor {\n" +
            "  cursor: pointer; }\n" +
            "\n" +
            "figure figcaption .public-DraftStyleDefault-block {\n" +
            "  text-align: center; }\n" +
            "\n" +
            ".aspectRatioPlaceholder .image-upoader-loader {\n" +
            "  position: absolute;\n" +
            "  bottom: 0px;\n" +
            "  left: 0%;\n" +
            "  background-color: #fff;\n" +
            "  width: 100%;\n" +
            "  /* height: 3px; */\n" +
            "  text-align: center;\n" +
            "  top: 0px;\n" +
            "  vertical-align: text-bottom;\n" +
            "  opacity: 0.7; }\n" +
            "  .aspectRatioPlaceholder .image-upoader-loader p {\n" +
            "    line-height: 5px;\n" +
            "    /* font-weight: 700; */\n" +
            "    /* text-transform: uppercase; */\n" +
            "    font-size: 14px;\n" +
            "    margin-top: 49%; }\n" +
            "\n" +
            "a[rel=token], .markup--query {\n" +
            "  color: #00ab6b;\n" +
            "  text-decoration: none;\n" +
            "  background-image: none !important; }\n" +
            "\n" +
            ".typeahead--mention {\n" +
            "  padding-top: 10px; }\n" +
            "\n" +
            ".typeahead .popover-inner {\n" +
            "  padding: 0;\n" +
            "  overflow: hidden;\n" +
            "  min-width: 100px; }\n" +
            "\n" +
            ".typeahead .typeahead-item:first-child {\n" +
            "  padding-top: 7px; }\n" +
            "\n" +
            ".typeahead--mention .typeahead-item {\n" +
            "  padding: 6px 15px;\n" +
            "  font-size: 13px; }\n" +
            "\n" +
            ".typeahead-item.is-active, .typeahead-item:hover {\n" +
            "  background: #02b875;\n" +
            "  color: #fff; }\n" +
            "\n" +
            ".typeahead .typeahead-item {\n" +
            "  cursor: pointer;\n" +
            "  padding: 5px 10px;\n" +
            "  line-height: 2;\n" +
            "  font-size: 12px;\n" +
            "  text-align: left;\n" +
            "  white-space: nowrap;\n" +
            "  text-overflow: ellipsis;\n" +
            "  overflow: hidden; }\n" +
            "\n" +
            ".typeahead .dante-avatar {\n" +
            "  margin: 0 6px 0 -2px; }\n" +
            "\n" +
            ".avatar-image--icon {\n" +
            "  width: 32px;\n" +
            "  height: 32px; }\n" +
            "\n" +
            ".avatar-image {\n" +
            "  display: inline-block;\n" +
            "  vertical-align: middle;\n" +
            "  border-radius: 100%; }\n" +
            "\n" +
            ".typeahead-item .avatar-image {\n" +
            "  width: 32px;\n" +
            "  height: 32px; }\n" +
            "\n" +
            ".typeahead--mention .popover-arrow {\n" +
            "  display: none; }\n" +
            "\n" +
            ".markup--user {\n" +
            "  color: #00ab6b;\n" +
            "  text-decoration: none; }\n" +
            "\n" +
            ".popover--card .popover-arrow {\n" +
            "  top: -14px; }\n" +
            "\n" +
            ".popover--card .popover--bottom .popover-arrow:after {\n" +
            "  transform: rotate(45deg) translate(6px, 6px);\n" +
            "  box-shadow: -1px -1px 1px -1px rgba(0, 0, 0, 0.44); }\n" +
            "\n" +
            ".popover--card .popover-arrow:after {\n" +
            "  content: '';\n" +
            "  display: block;\n" +
            "  width: 14px;\n" +
            "  height: 14px;\n" +
            "  background: #fff; }\n" +
            "\n" +
            ".popover--animated.is-active {\n" +
            "  visibility: visible;\n" +
            "  opacity: 1;\n" +
            "  transition: visibility 0s linear 0s,opacity .2s 0s; }\n" +
            "\n" +
            ".popover.is-active {\n" +
            "  visibility: visible; }\n" +
            "\n" +
            ".popover--animated {\n" +
            "  visibility: hidden;\n" +
            "  opacity: 0;\n" +
            "  transition: visibility 0s linear .2s,opacity .2s 0s; }\n" +
            "\n" +
            ".popoverCard {\n" +
            "  text-align: left; }\n" +
            "\n" +
            ".popoverCard-meta {\n" +
            "  width: 192px; }\n" +
            "\n" +
            ".u-floatLeft {\n" +
            "  float: left !important; }\n" +
            "\n" +
            ".u-floatRight {\n" +
            "  float: right !important; }\n" +
            "\n" +
            ".popoverCard-title {\n" +
            "  font-size: 18px;\n" +
            "  margin-bottom: 5px;\n" +
            "  margin-top: 0px; }\n" +
            "\n" +
            ".link {\n" +
            "  color: inherit;\n" +
            "  text-decoration: none;\n" +
            "  cursor: pointer; }\n" +
            "\n" +
            ".popoverCard-description {\n" +
            "  overflow: hidden;\n" +
            "  color: rgba(0, 0, 0, 0.44); }\n" +
            "\n" +
            ".u-clearfix:after {\n" +
            "  clear: both; }\n" +
            "\n" +
            ".u-clearfix:after, .u-clearfix:before {\n" +
            "  display: table;\n" +
            "  content: \" \"; }\n" +
            "\n" +
            ".dante-avatar {\n" +
            "  display: block;\n" +
            "  white-space: nowrap;\n" +
            "  overflow: hidden;\n" +
            "  text-overflow: ellipsis;\n" +
            "  line-height: normal; }\n" +
            "\n" +
            ".avatar-image--small {\n" +
            "  width: 60px;\n" +
            "  height: 60px; }\n" +
            "\n" +
            ".avatar-image {\n" +
            "  display: inline-block;\n" +
            "  vertical-align: middle;\n" +
            "  border-radius: 100%; }\n" +
            "\n" +
            ".popoverCard-actions {\n" +
            "  border-top: solid 1px rgba(0, 0, 0, 0.15);\n" +
            "  margin-top: 10px;\n" +
            "  padding-top: 10px; }\n" +
            "\n" +
            ".popoverCard-stats {\n" +
            "  font-size: 14px;\n" +
            "  line-height: 36px; }\n" +
            "\n" +
            ".popoverCard-stat {\n" +
            "  margin-right: 10px;\n" +
            "  color: rgba(0, 0, 0, 0.44); }\n" +
            "\n" +
            ".popoverCard-count {\n" +
            "  padding-left: 5px;\n" +
            "  color: rgba(0, 0, 0, 0.6); }\n" +
            "\n" +
            ".graf--layoutOutsetLeft {\n" +
            "  margin-left: -160px; }\n" +
            "\n" +
            ".graf--layoutFillWidth {\n" +
            "  margin-left: -200px;\n" +
            "  margin-right: -200px; }\n" +
            "\n" +
            ".graf--layoutOutsetLeft {\n" +
            "  width: 75%; }\n" +
            "\n" +
            ".graf--layoutInsetLeft, .graf--layoutOutsetLeft {\n" +
            "  float: left;\n" +
            "  margin-right: 30px;\n" +
            "  padding-top: 10px;\n" +
            "  padding-bottom: 10px; }\n" +
            "\n" +
            "/**\n" +
            " * @providesModule DraftEditor\n" +
            " * @permanent\n" +
            " */\n" +
            "/**\n" +
            " * We inherit the height of the container by default\n" +
            " */\n" +
            ".DraftEditor-root,\n" +
            ".DraftEditor-editorContainer,\n" +
            ".public-DraftEditor-content {\n" +
            "  height: inherit;\n" +
            "  text-align: initial; }\n" +
            "\n" +
            ".DraftEditor-root {\n" +
            "  position: relative; }\n" +
            "\n" +
            ".DraftEditor-root {\n" +
            "  overflow: auto; }\n" +
            "\n" +
            "/**\n" +
            " * Zero-opacity background used to allow focus in IE. Otherwise, clicks\n" +
            " * fall through to the placeholder.\n" +
            " */\n" +
            ".DraftEditor-editorContainer {\n" +
            "  background-color: rgba(255, 255, 255, 0);\n" +
            "  /* Repair mysterious missing Safari cursor */\n" +
            "  border-left: 0.1px solid transparent;\n" +
            "  position: relative;\n" +
            "  z-index: 1; }\n" +
            "\n" +
            ".public-DraftEditor-content {\n" +
            "  outline: none;\n" +
            "  white-space: pre-wrap; }\n" +
            "\n" +
            ".public-DraftEditor-block {\n" +
            "  position: relative; }\n" +
            "\n" +
            ".DraftEditor-alignLeft .public-DraftStyleDefault-block {\n" +
            "  text-align: left; }\n" +
            "\n" +
            ".DraftEditor-alignLeft .public-DraftEditorPlaceholder-root {\n" +
            "  left: 0;\n" +
            "  text-align: left; }\n" +
            "\n" +
            ".DraftEditor-alignCenter .public-DraftStyleDefault-block {\n" +
            "  text-align: center; }\n" +
            "\n" +
            ".DraftEditor-alignCenter .public-DraftEditorPlaceholder-root {\n" +
            "  margin: 0 auto;\n" +
            "  text-align: center;\n" +
            "  width: 100%; }\n" +
            "\n" +
            ".DraftEditor-alignRight .public-DraftStyleDefault-block {\n" +
            "  text-align: right; }\n" +
            "\n" +
            ".DraftEditor-alignRight .public-DraftEditorPlaceholder-root {\n" +
            "  right: 0;\n" +
            "  text-align: right; }\n" +
            "\n" +
            "/**\n" +
            " * @providesModule DraftEditorPlaceholder\n" +
            " */\n" +
            ".public-DraftEditorPlaceholder-root {\n" +
            "  color: #9197a3;\n" +
            "  position: absolute;\n" +
            "  z-index: 0; }\n" +
            "\n" +
            ".public-DraftEditorPlaceholder-hasFocus {\n" +
            "  color: #bdc1c9; }\n" +
            "\n" +
            ".DraftEditorPlaceholder-hidden {\n" +
            "  display: none; }\n" +
            "\n" +
            "/**\n" +
            " * @providesModule DraftStyleDefault\n" +
            " */\n" +
            ".public-DraftStyleDefault-block {\n" +
            "  position: relative;\n" +
            "  white-space: pre-wrap; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-ltr {\n" +
            "  direction: ltr;\n" +
            "  text-align: left; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-rtl {\n" +
            "  direction: rtl;\n" +
            "  text-align: right; }\n" +
            "\n" +
            "/**\n" +
            " * These rules provide appropriate text direction for counter pseudo-elements.\n" +
            " */\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-listLTR {\n" +
            "  direction: ltr; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-listRTL {\n" +
            "  direction: rtl; }\n" +
            "\n" +
            "/**\n" +
            " * Default spacing for list container elements. Override with CSS as needed.\n" +
            " */\n" +
            ".public-DraftStyleDefault-ul,\n" +
            ".public-DraftStyleDefault-ol {\n" +
            "  margin: 16px 0;\n" +
            "  padding: 0; }\n" +
            "\n" +
            "/**\n" +
            " * Default counters and styles are provided for five levels of nesting.\n" +
            " * If you require nesting beyond that level, you should use your own CSS\n" +
            " * classes to do so. If you care about handling RTL languages, the rules you\n" +
            " * create should look a lot like these.\n" +
            " */\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth0.public-DraftStyleDefault-listLTR {\n" +
            "  margin-left: 1.5em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth0.public-DraftStyleDefault-listRTL {\n" +
            "  margin-right: 1.5em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth1.public-DraftStyleDefault-listLTR {\n" +
            "  margin-left: 3em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth1.public-DraftStyleDefault-listRTL {\n" +
            "  margin-right: 3em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth2.public-DraftStyleDefault-listLTR {\n" +
            "  margin-left: 4.5em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth2.public-DraftStyleDefault-listRTL {\n" +
            "  margin-right: 4.5em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth3.public-DraftStyleDefault-listLTR {\n" +
            "  margin-left: 6em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth3.public-DraftStyleDefault-listRTL {\n" +
            "  margin-right: 6em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth4.public-DraftStyleDefault-listLTR {\n" +
            "  margin-left: 7.5em; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-depth4.public-DraftStyleDefault-listRTL {\n" +
            "  margin-right: 7.5em; }\n" +
            "\n" +
            "/**\n" +
            " * Only use `square` list-style after the first two levels.\n" +
            " */\n" +
            ".public-DraftStyleDefault-unorderedListItem {\n" +
            "  list-style-type: square;\n" +
            "  position: relative; }\n" +
            "\n" +
            ".public-DraftStyleDefault-unorderedListItem.public-DraftStyleDefault-depth0 {\n" +
            "  list-style-type: disc; }\n" +
            "\n" +
            ".public-DraftStyleDefault-unorderedListItem.public-DraftStyleDefault-depth1 {\n" +
            "  list-style-type: circle; }\n" +
            "\n" +
            "/**\n" +
            " * Ordered list item counters are managed with CSS, since all list nesting is\n" +
            " * purely visual.\n" +
            " */\n" +
            ".public-DraftStyleDefault-orderedListItem {\n" +
            "  list-style-type: none;\n" +
            "  position: relative; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-orderedListItem.public-DraftStyleDefault-listLTR:before {\n" +
            "  left: -36px;\n" +
            "  position: absolute;\n" +
            "  text-align: right;\n" +
            "  width: 30px; }\n" +
            "\n" +
            "/* @noflip */\n" +
            ".public-DraftStyleDefault-orderedListItem.public-DraftStyleDefault-listRTL:before {\n" +
            "  position: absolute;\n" +
            "  right: -36px;\n" +
            "  text-align: left;\n" +
            "  width: 30px; }\n" +
            "\n" +
            "/**\n" +
            " * Counters are reset in JavaScript. If you need different counter styles,\n" +
            " * override these rules. If you need more nesting, create your own rules to\n" +
            " * do so.\n" +
            " */\n" +
            ".public-DraftStyleDefault-orderedListItem:before {\n" +
            "  content: counter(ol0) \". \";\n" +
            "  counter-increment: ol0; }\n" +
            "\n" +
            ".public-DraftStyleDefault-orderedListItem.public-DraftStyleDefault-depth1:before {\n" +
            "  content: counter(ol1) \". \";\n" +
            "  counter-increment: ol1; }\n" +
            "\n" +
            ".public-DraftStyleDefault-orderedListItem.public-DraftStyleDefault-depth2:before {\n" +
            "  content: counter(ol2) \". \";\n" +
            "  counter-increment: ol2; }\n" +
            "\n" +
            ".public-DraftStyleDefault-orderedListItem.public-DraftStyleDefault-depth3:before {\n" +
            "  content: counter(ol3) \". \";\n" +
            "  counter-increment: ol3; }\n" +
            "\n" +
            ".public-DraftStyleDefault-orderedListItem.public-DraftStyleDefault-depth4:before {\n" +
            "  content: counter(ol4) \". \";\n" +
            "  counter-increment: ol4; }\n" +
            "\n" +
            ".public-DraftStyleDefault-depth0.public-DraftStyleDefault-reset {\n" +
            "  counter-reset: ol0; }\n" +
            "\n" +
            ".public-DraftStyleDefault-depth1.public-DraftStyleDefault-reset {\n" +
            "  counter-reset: ol1; }\n" +
            "\n" +
            ".public-DraftStyleDefault-depth2.public-DraftStyleDefault-reset {\n" +
            "  counter-reset: ol2; }\n" +
            "\n" +
            ".public-DraftStyleDefault-depth3.public-DraftStyleDefault-reset {\n" +
            "  counter-reset: ol3; }\n" +
            "\n" +
            ".public-DraftStyleDefault-depth4.public-DraftStyleDefault-reset {\n" +
            "  counter-reset: ol4; }\n" +
            "\n" +
            ".debugControls {\n" +
            "  position: fixed;\n" +
            "  left: 0px;\n" +
            "  bottom: 0px;\n" +
            "  z-index: 999999;\n" +
            "  background-color: #fff;\n" +
            "  width: 100%;\n" +
            "  border-top: 1px solid #000; }\n" +
            "  .debugControls ul {\n" +
            "    margin: 0px auto;\n" +
            "    margin-top: 12px; }\n" +
            "  .debugControls li {\n" +
            "    float: left;\n" +
            "    margin-left: 20px;\n" +
            "    display: block;\n" +
            "    margin-bottom: 10px;\n" +
            "    font-family: \"jaf-bernino-sans\", \"Open Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", \"Lucida Sans\", Geneva, Verdana, sans-serif;\n" +
            "    font-size: 12px; }\n" +
            "  .debugControls a {\n" +
            "    color: #000; }\n" +
            "    .debugControls a:active {\n" +
            "      color: #000;\n" +
            "      outline: 0; }\n" +
            "\n" +
            ".debugZone {\n" +
            "  background-color: #101010;\n" +
            "  color: #ccc;\n" +
            "  clear: both;\n" +
            "  padding-top: 10px;\n" +
            "  position: fixed;\n" +
            "  right: 0;\n" +
            "  left: 0;\n" +
            "  padding: 1rem;\n" +
            "  width: 100%;\n" +
            "  z-index: 9999;\n" +
            "  height: 130px;\n" +
            "  bottom: 0px;\n" +
            "  height: 100%;\n" +
            "  top: 0px; }\n" +
            "  .debugZone.open {\n" +
            "    height: 100%;\n" +
            "    top: -74px; }\n" +
            "  .debugZone.collapsed {\n" +
            "    height: 130px;\n" +
            "    bottom: 0px; }\n" +
            "  .debugZone .dante-debug-close {\n" +
            "    position: absolute;\n" +
            "    width: 20px;\n" +
            "    height: 20px;\n" +
            "    right: 43px;\n" +
            "    top: 38px; }\n" +
            "    .debugZone .dante-debug-close.close.hairline::before {\n" +
            "      height: 1px; }\n" +
            "    .debugZone .dante-debug-close.close::before {\n" +
            "      -webkit-transform: rotate(45deg);\n" +
            "      -moz-transform: rotate(45deg);\n" +
            "      -ms-transform: rotate(45deg);\n" +
            "      -o-transform: rotate(45deg);\n" +
            "      transform: rotate(45deg); }\n" +
            "    .debugZone .dante-debug-close.close::before, .debugZone .dante-debug-close.close::after {\n" +
            "      content: '';\n" +
            "      position: absolute;\n" +
            "      height: 2px;\n" +
            "      width: 100%;\n" +
            "      top: 50%;\n" +
            "      left: 0;\n" +
            "      margin-top: -1px;\n" +
            "      background: #fff;\n" +
            "      height: 1px; }\n" +
            "    .debugZone .dante-debug-close.close::after {\n" +
            "      -webkit-transform: rotate(-45deg);\n" +
            "      -moz-transform: rotate(-45deg);\n" +
            "      -ms-transform: rotate(-45deg);\n" +
            "      -o-transform: rotate(-45deg);\n" +
            "      transform: rotate(-45deg); }\n" +
            "  .debugZone .debugOutput {\n" +
            "    float: right;\n" +
            "    width: 67%;\n" +
            "    margin-right: 12%; }\n" +
            "    .debugZone .debugOutput pre {\n" +
            "      color: white;\n" +
            "      height: 450px;\n" +
            "      overflow: auto;\n" +
            "      padding: 10px;\n" +
            "      background-color: #353232;\n" +
            "      border: 2px solid #c019dc; }\n" +
            "\n" +
            ".signature {\n" +
            "  position: relative;\n" +
            "  display: table;\n" +
            "  float: left;\n" +
            "  margin-bottom: 20px; }\n" +
            "\n" +
            ".signature img {\n" +
            "  float: left;\n" +
            "  margin-right: 30px;\n" +
            "  margin-bottom: 0 !important;\n" +
            "  height: 100px;\n" +
            "  width: 100px;\n" +
            "  border-radius: 50px; }\n" +
            "\n" +
            ".signature .text {\n" +
            "  width: 100%;\n" +
            "  display: table-cell;\n" +
            "  vertical-align: middle; }\n" +
            "\n" +
            ".signature .text p {\n" +
            "  margin-bottom: 0 !important; }\n" +
            "\n" +
            ".dante-clearfix:after {\n" +
            "  clear: both; }\n" +
            "\n" +
            ".dante-clearfix:before {\n" +
            "  display: table;\n" +
            "  content: \" \"; }\n" +
            "\n" +
            ".dropdown .btn {\n" +
            "  color: #BEC2CC;\n" +
            "  padding: 0 10px;\n" +
            "  width: auto;\n" +
            "  font-size: 12px; }\n" +
            "\n" +
            ".text-toolbar button {\n" +
            "  position: relative;\n" +
            "  float: left;\n" +
            "  height: 40px;\n" +
            "  width: 40px;\n" +
            "  background: transparent;\n" +
            "  border: 0;\n" +
            "  padding: 0;\n" +
            "  cursor: pointer;\n" +
            "  padding: 0; }\n" +
            "\n" +
            ".dropdown {\n" +
            "  float: left; }\n" +
            "\n" +
            ".dropdown, .dropup {\n" +
            "  position: relative; }\n" +
            "\n" +
            ".dropdown .btn {\n" +
            "  color: #BEC2CC;\n" +
            "  padding: 0 10px;\n" +
            "  width: auto;\n" +
            "  font-size: 12px; }\n" +
            "\n" +
            ".dante-menu-button.visible-overflow {\n" +
            "  overflow: visible; }\n" +
            "\n" +
            ".dante-menu-button button {\n" +
            "  position: relative;\n" +
            "  float: left;\n" +
            "  height: 40px;\n" +
            "  width: 40px;\n" +
            "  background: transparent !important;\n" +
            "  border: 0;\n" +
            "  padding: 0;\n" +
            "  cursor: pointer;\n" +
            "  padding: 0; }\n" +
            "\n" +
            ".dropdown .dropdown-menu {\n" +
            "  background: #2A2B32;\n" +
            "  padding: 0;\n" +
            "  max-height: 300px;\n" +
            "  overflow-y: auto;\n" +
            "  width: auto;\n" +
            "  min-width: 60px; }\n" +
            "\n" +
            ".open > .dropdown-menu {\n" +
            "  display: block; }\n" +
            "\n" +
            ".dropdown-menu {\n" +
            "  position: absolute;\n" +
            "  top: 100%;\n" +
            "  left: 0;\n" +
            "  z-index: 1000;\n" +
            "  display: none;\n" +
            "  float: left;\n" +
            "  min-width: 160px;\n" +
            "  padding: 5px 0;\n" +
            "  margin: 2px 0 0;\n" +
            "  font-size: 14px;\n" +
            "  text-align: left;\n" +
            "  list-style: none;\n" +
            "  background-color: #fff;\n" +
            "  -webkit-background-clip: padding-box;\n" +
            "  background-clip: padding-box;\n" +
            "  border: 1px solid #ccc;\n" +
            "  border: 1px solid rgba(0, 0, 0, 0.15);\n" +
            "  border-radius: 4px;\n" +
            "  -webkit-box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175);\n" +
            "  box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175); }\n" +
            "\n" +
            ".dropdown .dropdown-menu li {\n" +
            "  border-bottom: 1px solid #383943; }\n" +
            "\n" +
            ".editor .container .content-edit .text-toolbar .dropdown .dropdown-menu li a {\n" +
            "  color: #BEC2CC;\n" +
            "  font-size: 12px;\n" +
            "  padding: 0 10px;\n" +
            "  line-height: 30px; }\n" +
            "\n" +
            ".dropdown-menu > li > a {\n" +
            "  display: block;\n" +
            "  padding: 3px 20px;\n" +
            "  clear: both;\n" +
            "  font-weight: 400;\n" +
            "  line-height: 1.42857143;\n" +
            "  color: #fff;\n" +
            "  white-space: nowrap; }\n" +
            "\n" +
            ".btn-default.active, .btn-default:active, .open > .dropdown-toggle.btn-default {\n" +
            "  color: #fff;\n" +
            "  background-color: #e6e6e6;\n" +
            "  border-color: #adadad; }\n" +
            "\n" +
            ".btn-default.active, .btn-default:active, .open > .dropdown-toggle.btn-default {\n" +
            "  background-image: none; }\n" +
            "\n" +
            ".btn-default.active, .btn-default:active, .open > .dropdown-toggle.btn-default {\n" +
            "  color: #fff;\n" +
            "  background-color: #e6e6e6;\n" +
            "  border-color: #adadad; }\n" +
            "\n" +
            ".btn-default {\n" +
            "  color: #fff;\n" +
            "  background-color: #fff;\n" +
            "  border-color: #ccc; }\n" +
            "\n" +
            ".btn {\n" +
            "  display: inline-block;\n" +
            "  padding: 6px 12px;\n" +
            "  margin-bottom: 0;\n" +
            "  font-size: 14px;\n" +
            "  font-weight: 400;\n" +
            "  line-height: 1.42857143;\n" +
            "  text-align: center;\n" +
            "  white-space: nowrap;\n" +
            "  vertical-align: middle;\n" +
            "  -ms-touch-action: manipulation;\n" +
            "  touch-action: manipulation;\n" +
            "  cursor: pointer;\n" +
            "  -webkit-user-select: none;\n" +
            "  -moz-user-select: none;\n" +
            "  -ms-user-select: none;\n" +
            "  user-select: none;\n" +
            "  background-image: none;\n" +
            "  border: 1px solid transparent;\n" +
            "  border-radius: 4px; }\n" +
            "\n" +
            "/*# sourceMappingURL=dante.css.map*/"+
            "</style";
}
