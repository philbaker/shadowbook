(ns components.design.menu
  (:require [reagent.core :as r]))

(defn menu [items]
  (let [menu-open (r/atom true)] 
    (fn []
      [:div 
       [:div.text-sm.bg-gray-100.p-3.shadow-sm.rounded-sm.flex.justify-between.items-start
        {:class (when (not @menu-open) "hidden")}
        [:ul
         (for [item items]
           ^{:key item} [:li item])]
        [:button {:dangerouslySetInnerHTML {:__html "&times;"}
                  :on-click #(swap! menu-open not)}]]
       (when (not @menu-open)
         [:button.text-xs.bg-gray-100.p-1.rounded-sm 
          {:on-click #(swap! menu-open not)} 
          "Open menu"])
       ])))
