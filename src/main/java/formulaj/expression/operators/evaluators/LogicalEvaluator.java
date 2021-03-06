/**
 * Copyright (C) 2013 Contributors.
 *
 * This file is part of FormulaJ.
 *
 * FormulaJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FormulaJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see [http://www.gnu.org/licenses/].
 *
 * Contact: formulaj-user-list@googlegroups.com.
 */
package formulaj.expression.operators.evaluators;

import formulaj.common.base.primitives.Booleans;
import formulaj.expression.Value;
import formulaj.expression.operators.LogicalOperator;

public final class LogicalEvaluator implements OperatorEvaluator<Boolean, LogicalOperator>
{
    /**
     * {@inheritDoc}
     */
    @Override
    public <E> Value<Boolean> eval(E leftValue, E rightValue, LogicalOperator operator)
    {
        return new Value<Boolean>(operator.evaluate(Booleans.valueOf(leftValue), Booleans.valueOf(rightValue)));
    }
}
