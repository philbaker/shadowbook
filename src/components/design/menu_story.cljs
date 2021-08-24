(ns components.design.menu-story
  (:require
    [components.design.menu :refer [menu]]
    [reagent.core :as r]))

(def ^:export default
  #js {:title "Menu"
       :component (r/reactify-component menu)})

(defn ^:export PopOut
  []
  (r/as-element [menu ["Home" "About" "Contact"]]))
