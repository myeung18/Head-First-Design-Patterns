package jdp3e.interpreter.implementation_2;

class NotExpression implements Employee {
	private Employee emp;

	public NotExpression(Employee expr) {
		this.emp = expr;
	}

	@Override
	public boolean interpret(Context context) {
		return !emp.interpret(context);
	}
}
