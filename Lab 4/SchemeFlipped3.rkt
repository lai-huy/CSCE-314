#lang racket
(define (reverse l)
	(if (null? l)
		'()
		(append (reverse (cdr l)) (list (car l)))
	)
)

(define (alpha list)
	(filter char-alphabetic? list)
)

(define (equallist? list1 list2)
	(cond
		((and (empty? list1) (empty? list2)) #t)
		((char=? (car list1) (car list2)) (equallist? (cdr list1) (cdr list2)))
		(else #f)
	)
)

(define (palindrome? list)
	(define l (alpha list))
	(define r (reverse l))
	(equallist? l r)
)



(display (palindrome? '(#\m #\a #\d #\a #\m #\- #\i #\m #\- #\a #\d #\a #\m)))
(newline)
(display (palindrome? '(#\w #\a #\s #\- #\t #\h #\a #\t #\- #\a #\- #\r #\a #\t #\- #\i #\- #\s #\a #\w)))
(newline)
(exit)