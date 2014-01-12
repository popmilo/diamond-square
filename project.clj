(defproject dimaond-square "0.1.0-SNAPSHOT"
  :description "A simple implementation of the diamon-square algorithm"
  :url "https://github.com/mediocregopher/diamond-square"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]]

  :source-paths ["src"]
  :plugins [[lein-cljsbuild "1.0.1"]]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :compiler {
                :output-to "app.js"
                :output-dir "out"
                :optimizations :simple
                :source-map "app.js.map"}}]})
