; Author: Huy Lai, Nifemi Esan, Elizabeth Knatcher
; Date: 04 September 2022
; File: SchemeFlipped1.scm
; Class: CSCE 314

(define (typeID x)
  (cond
   ((boolean? x) (display "Boolean\n"))
   ((integer? x) (display "Integer\n"))
   ((rational? x) (display "Float\n"))
   (else (display "Unkown\n"))
   )
)

(define (main)
  (typeID #t)
  (typeID 314)
  (typeID 3/14)
)

(main)

(exit)
