(ns components.design.alert)

(defn alert [kind text]
  (let [error-type {:error "bg-red-300"
              :success "bg-green-100"
              :warning "bg-red-100"
              :info "bg-blue-100"}] 
    [:div.p-3.rounded-sm.text-sm 
     {:class (kind error-type)}
     text]))
