(ns clojure-InterOP.core
(:import utils.demo)  ;; java source file needs to be compiled to a class file
       	(:gen-class ))

(defn -main [& args]
  ;; compiles but error on execution
 ;; (let [d (utils.demo. )]     (.twice  d))
 ;;(println (utils.demo. 4 ) )
  (println (. demo twice 5 ))
  (println (. demo half 5 ))
  (println (. demo halves 3 5 ))  
  (doseq [j (range 2 20 3) ] (println (. demo twice j)))
)
