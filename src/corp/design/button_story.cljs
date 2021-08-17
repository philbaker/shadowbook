(ns corp.design.button-story
  (:require
    ["@storybook/addon-actions" :refer (action)]
    [corp.design.lib :refer ($)]
    [corp.design.button :as button]
    [corp.design.header :refer [header]]
    [reagent.core :as r]))


;;
;; When developing, storybook will attempt to use any `def` in this namespace
;; as a story. So make sure you only put _stories_ in this namespace; any
;; components, fixtures, etc. should be defined in a separate namespace.
;;
;; Once we've done a release build, we need to ensure that we preserve the names
;; that storybook expects, so we need to annotate each `def` with an `:export`
;; metadata.
;;
;; Other than those two caveats, everything works pretty seamlessly! Neat!
;;


(def ^:export default
  #js {:title "Header"
       :component (r/reactify-component header)})

(defn ^:export LoggedIn
  []
  (r/as-element [header "You are logged in!"]))
  
; (def ^:export default
;   #js {:title "My Button"
;        :component button/basic})

; (defn ^:export Text
;   []
;   ($ button/basic #js {:onClick (action "clicked")} "click"))


; (defn ^:export Emoji
;   []
;   ($ button/basic
;      #js {:onClick (action "clicked")}
;      ($ "span" #js {:role "img" :aria-label "so cool"}
;         "😀 😎 👍 💯")))
