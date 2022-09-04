Author: Huy Lai, Nifemi Esan, Elizabeth Knatcher
; Date: 04 September 2022
; File: SchemeFlipped1.scm
; Class: CSCE 314

(define (letterGrade grade)
  (cond
   ((<= grade 0) "Error, grade not in valid range")
   ((<= grade 60) "F")
   ((<= grade 70) "D")
   ((<= grade 80) "C")
   ((<= grade 90) "B")
   ((<= grade 100) "A")
  (else "Error, grade not in valid range")
  )
)

(define (main)
  (display (letterGrade 100))
  (display "\n")
  (display (letterGrade 91))
  (display "\n")
  (display (letterGrade 89))
  (display "\n")
  (display (letterGrade 79))
  (display "\n")
  (display (letterGrade 54))
  (display "\n")
  (display (letterGrade -31))
  (display "\n")
  (display (letterGrade 1000))
  (display "\n")
)

(main)
(exit)
