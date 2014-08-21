package nl.jchmb.utils.filter;

import java.util.ArrayList;
import java.util.Collection;

import nl.jchmb.utils.validator.AcceptingValidator;
import nl.jchmb.utils.validator.Validator;

public class ValidatorFilter<T> implements Filter<T, Collection<T>> {
	private Validator<T> validator;
	
	public ValidatorFilter() {
		setValidator(new AcceptingValidator<T>());
	}
	
	public void setValidator(Validator<T> validator) {
		this.validator = validator;
	}
	
	@Override
	public Collection<T> applyFilter(Collection<T> collection) {
		Collection<T> filteredCollection = new ArrayList<T>();
		for (T object : collection) {
			if (validator.validate(object)) {
				filteredCollection.add(object);
			}
		}
		return filteredCollection;
	}
}
