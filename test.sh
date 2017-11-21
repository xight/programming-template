#!/usr/local/bin/bash
testcases=("1" "2")
run="python main.py"

for testcase in ${testcases[@]}; do
	if [[ -e testcase/${testcase}.in && -e testcase/${testcase}.out ]]; then
		$run < testcase/${testcase}.in | diff testcase/${testcase}.out - && echo "OK: ${testcase}" || echo "NG: ${testcase}"
	fi
done
