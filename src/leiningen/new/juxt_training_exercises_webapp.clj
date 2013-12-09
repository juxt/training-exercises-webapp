(ns leiningen.new.juxt-training-exercises-webapp
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "juxt-training-exercises-webapp"))

(defn juxt-training-exercises-webapp
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' juxt-training-exercises-webapp project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
