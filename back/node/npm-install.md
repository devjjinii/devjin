## npm-install

* -P, --save-prod: Package will appear in your dependencies. This is the default unless -D or -O are present.
* -D, --save-dev: Package will appear in your devDependencies.
   * npm install name -D // == npm install name --save-dev
* -O, --save-optional: Package will appear in your optionalDependencies.
* --no-save: Prevents saving to dependencies.
* --save : npm5부터는 --save옵션이 기본적으로 설정되어 있기 때문에 안 붙여도 된다.
* -g : 글로벌 패키지에 추가 (다른 프로젝트에서 해당 패키지 사용 가능)
* 참고 : https://docs.npmjs.com/cli/install
