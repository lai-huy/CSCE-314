; File: SchemeIntro3.scm
; Author: Huy Lai
; Email: lai.huy@tamu.edu
; Date: 2022-08-26

; (define (fact n) (if (< n 2) 1 (* n (fact (- n 1)))))
; (trace fact)
; (fact (5))

(define (fib n) (if (< n 3) 1 (+ (fib (- n 1)) (fib (- n 2)))))
(trace fib)
(fib (read))
