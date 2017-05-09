(ns clojure-InterOP.core
(:import utils.demo)  ;; java source file needs to be compiled to a class file
       	(:gen-class ))

(defn -main [& args]
(println "clj-test")
(println [utils.demo 4      ])  ;; compiles but error on execution
)
