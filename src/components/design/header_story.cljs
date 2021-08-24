(ns components.design.header-story
  (:require
    ["@storybook/addon-actions" :refer (action)]
    [components.design.lib :refer ($)]
    [components.design.button :as button]
    [components.design.header :refer [header]]
    [reagent.core :as r]))

(def ^:export default
  #js {:title "Header"
       :component (r/reactify-component header)})

(defn ^:export LoggedIn
  []
  (r/as-element [header "You are now logged in!"]))
