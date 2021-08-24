(ns components.design.alert-story
  (:require
    [components.design.alert :refer [alert]]
    [reagent.core :as r]))

(def ^:export default
  #js {:title "Alerts"
       :component (r/reactify-component alert)})

(defn ^:export Warning
  []
  (r/as-element [alert :warning "Are you sure?"]))
