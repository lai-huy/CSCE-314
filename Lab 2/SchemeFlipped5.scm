; Author: Huy Lai, Nifemi Esan, Elizabeth Knatcher
; Date: 04 September 2022
; File: SchemeFlipped1.scm
; Class: CSCE 314

(define (is-positive x)
  (if (>= x 0) #t #f)
)

(define (main)
  (display (is-positive 0))
  (display "\n")
  (display (is-positive -5))
  (display "\n")
)

(main)
(exit)
